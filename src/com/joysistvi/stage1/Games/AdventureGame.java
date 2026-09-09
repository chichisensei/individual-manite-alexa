package com.joysistvi.stage1.Games;

public class AdventureGame {

    public static void main(String[] args) throws InterruptedException {
        //one running
        String emoji = "🏃‍♀️‍➡️";
        String reverseEmoji = "🏃‍♀️";
        int totalFrames = 40;
        int reverseTotalFrames = 200;

        for (int frame = 0; frame <= totalFrames; frame++) {
            System.out.print("\r");

            int spacesCount = (int) Math.pow(frame, 1.1);
            String spaces = " ".repeat(spacesCount);

            System.out.print(spaces + emoji);

            Thread.sleep(100);
        }

        for (int frame = reverseTotalFrames; frame >= 0; frame--) {
            System.out.print("\r");

            String spaces = " ".repeat(frame);

            System.out.print(spaces + reverseEmoji);

            Thread.sleep(80);
        }
        System.out.print("\r" + reverseEmoji);
        System.out.println("Arrived");



        System.out.println("\nFinished!");

        //meeting in the middle
        String runnerRight = "🏃‍♀️‍➡️";
        String runnerLeft = "🏃‍♀️";

        int trackLength = 150;
        int r1Pos = 0;
        int r2Pos = trackLength;

        System.out.println("Ready..Set..Go..");

        while (r1Pos < r2Pos) {
            System.out.print("\r");

            String paddingLeft = " ".repeat(r1Pos);

            int distanceBetween = r2Pos - r1Pos - 1;

            String paddingMid = " ".repeat(Math.max(0, distanceBetween));

            System.out.print(paddingLeft + runnerRight + paddingMid + runnerLeft);

            r1Pos += 1;
            r2Pos -= 1;

            Thread.sleep(120);
        }
        System.out.print("\r" + " ".repeat(r1Pos) + "❤️❤️");

        // running with background
        String runner = "🏃‍♀️‍➡️", backgroundElem = "🐼";

        int worldLength = 150, screenWidth = 40, cameraCenter = screenWidth / 2;

        for (int runnerWorldx = 0; runnerWorldx < worldLength; runnerWorldx++) {
            System.out.print("\r");

            double cameraOffset = Math.sin(runnerWorldx * 0.4) * 2.0;
            int runnerScreenPos = cameraCenter + (int) cameraOffset;

            String leftBackground = "";

            for (int i = 0; i < runnerScreenPos; i++) {
                int worldCoordinate = runnerWorldx - runnerScreenPos + i;

                if (worldCoordinate % 10 == 0 && worldCoordinate > 0) {
                    leftBackground += backgroundElem;
                } else {
                    leftBackground += "_";
                }
            }

            String rightBackground = "";
            for (int i = runnerScreenPos + 1; i < screenWidth; i++) {
                int worldCoordinate = runnerWorldx - runnerScreenPos + i;
                if (worldCoordinate % 10 == 0 && worldCoordinate < worldLength) {
                    rightBackground += backgroundElem;
                } else {
                    rightBackground += "_";
                }
            }

            System.out.print("[" + leftBackground + runner + rightBackground + "]");

            Thread.sleep(120);
        }
    }
}
