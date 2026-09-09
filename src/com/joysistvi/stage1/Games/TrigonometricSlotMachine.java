package com.joysistvi.stage1.Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrigonometricSlotMachine extends JPanel implements ActionListener {

    // Game state variables
    private int balance = 100;
    private JLabel balanceLabel;
    private JButton playButton;

    // Wheel assets & positioning
    private final String[] emojis = {"😍", "😂", "🔥", "💎", "🎰"};
    private final double angleSpacing = (2 * Math.PI) / emojis.length;

    // 3 Reel States (Angles, Spin Ticks, Active Flags, Selected Symbols)
    private double[] reelAngles = {0.0, 0.0, 0.0};
    private int[] targetTicks = new int[3];
    private boolean[] isReelSpinning = {false, false, false};
    private String[] selectedEmojis = new String[3];

    // Animation control
    private Timer timer;
    private int currentTicks = 0;

    public TrigonometricSlotMachine() {
        setLayout(new BorderLayout());

        // 1. Balance Label (Top)
        balanceLabel = new JLabel("Balance: $" + balance, SwingConstants.CENTER);
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        balanceLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(balanceLabel, BorderLayout.NORTH);

        // 2. Play Button (Bottom)
        playButton = new JButton("Spin / Play Again ($10)");
        playButton.setFont(new Font("Arial", Font.BOLD, 16));
        playButton.addActionListener(e -> startSpin());
        add(playButton, BorderLayout.SOUTH);

        // 3. Animation Loop (~60 FPS)
        timer = new Timer(16, this);
    }

    private void startSpin() {
        if (balance >= 10) {
            balance -= 10;
            balanceLabel.setText("Balance: $" + balance);
            playButton.setEnabled(false);

            currentTicks = 0;

            for (int i = 0; i < 3; i++) {
                isReelSpinning[i] = true;
                // Randomized spin durations
                targetTicks[i] = 70 + (int) (Math.random() * 50);
            }

            timer.start();
        } else {
            JOptionPane.showMessageDialog(this, "Game Over! You're out of money.");
            playButton.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentTicks++;
        boolean allStopped = true;

        for (int i = 0; i < 3; i++) {
            if (isReelSpinning[i]) {
                // Continuous downward vertical rotation
                reelAngles[i] += 0.18 + (Math.random() * 0.02);
                reelAngles[i] %= (2 * Math.PI);

                if (currentTicks >= targetTicks[i]) {
                    isReelSpinning[i] = false;

                    // Snap the reel so the closest emoji lands at dead-center (angle = Math.PI / 2)
                    int bestIndex = getFrontEmojiIndex(i);
                    reelAngles[i] = (Math.PI / 2) - (bestIndex * angleSpacing);
                    reelAngles[i] = (reelAngles[i] % (2 * Math.PI) + (2 * Math.PI)) % (2 * Math.PI);
                } else {
                    allStopped = false;
                }
            }
        }

        repaint();

        if (allStopped) {
            timer.stop();
            resolveRound();
        }
    }

    private int getFrontEmojiIndex(int reel) {
        int bestIndex = 0;
        double maxSin = -2.0;

        // Front-center of the vertical cylinder occurs where sin(angle) = 1.0
        for (int i = 0; i < emojis.length; i++) {
            double currentEmojiAngle = reelAngles[reel] + (i * angleSpacing);
            double sinVal = Math.sin(currentEmojiAngle);
            if (sinVal > maxSin) {
                maxSin = sinVal;
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    private void resolveRound() {
        for (int reel = 0; reel < 3; reel++) {
            int frontIndex = getFrontEmojiIndex(reel);
            selectedEmojis[reel] = emojis[frontIndex];
        }

        String slot1 = selectedEmojis[0];
        String slot2 = selectedEmojis[1];
        String slot3 = selectedEmojis[2];

        if (slot1.equals(slot2) && slot2.equals(slot3)) {
            if (slot1.equals("💎")) {
                balance += 200;
                JOptionPane.showMessageDialog(this, "MEGA JACKPOT! 💎 💎 💎 - Won $200!");
            } else {
                balance += 100;
                JOptionPane.showMessageDialog(this, "TRIPLE MATCH! " + slot1 + " " + slot2 + " " + slot3 + " - Won $100!");
            }
        } else if (slot1.equals(slot2) || slot2.equals(slot3) || slot1.equals(slot3)) {
            balance += 20;
            JOptionPane.showMessageDialog(this, "DOUBLE MATCH! Won $20!");
        }

        balanceLabel.setText("Balance: $" + balance);
        playButton.setEnabled(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerY = getHeight() / 2;
        int radius = 90; // Height depth radius of the cylinder
        int reelWidth = getWidth() / 3;

        for (int reel = 0; reel < 3; reel++) {
            int centerX = (reel * reelWidth) + (reelWidth / 2);

            for (int i = 0; i < emojis.length; i++) {
                double currentEmojiAngle = reelAngles[reel] + (i * angleSpacing);

                // Vertical depth projection
                double sinValue = Math.sin(currentEmojiAngle); // Position along front arc
                double cosValue = Math.cos(currentEmojiAngle); // 3D z-depth facing forward

                // Render symbols on the front side of the reel
                if (sinValue > -0.2) {
                    // Vertical projection formula
                    int renderY = centerY - (int) (cosValue * radius);

                    // Dynamic font scaling and opacity driven by depth
                    double depthFactor = (sinValue + 1.0) / 2.0; // Normalized 0.0 to 1.0
                    int baseFontSize = 50;
                    int dynamicFontSize = (int) (baseFontSize * (0.55 + (0.45 * depthFactor)));

                    float alpha = Math.max(0.1f, (float) Math.pow(depthFactor, 1.5));

                    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
                    g2d.setFont(new Font("Segoe UI Emoji", Font.PLAIN, dynamicFontSize));

                    FontMetrics metrics = g2d.getFontMetrics();
                    int x = centerX - (metrics.stringWidth(emojis[i]) / 2);
                    int y = renderY + (metrics.getAscent() / 3);

                    g2d.drawString(emojis[i], x, y);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Trigonometric Slot Machine");
            TrigonometricSlotMachine panel = new TrigonometricSlotMachine();

            frame.add(panel);
            frame.setSize(600, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}