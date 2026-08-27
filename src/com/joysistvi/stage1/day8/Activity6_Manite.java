package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_Manite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coffee, userPrefer;

        // Create an account (Signing up)

            System.out.println("=== Sign Up to Chichi Cafe ===");
            System.out.print("Create an email: ");
            String emailCreated = input.nextLine();
            System.out.print("Create a password: ");
            String passCreated = input.nextLine();

            for (int i = 0; i < 40; i++) {
                System.out.println(" ");
            }


        // Logging in

        for (int i = 3; i >= 0; i--) {
            System.out.println("=== Sign In to Chichi Cafe ===");
            System.out.print("Enter your email: ");
            String email = input.nextLine();
            System.out.print("Enter your password: ");
            String password = input.nextLine();

            if (i > 0) {
                if (email.equals(emailCreated) && password.equals(passCreated)) {
                    System.out.println("Login Successful!");
                    i = 0;
                } else {
                    if (!email.equals(emailCreated) && !password.equals(passCreated)) {
                        System.out.println("Wrong email and password!");
                        System.out.printf("Attempts remaining: %d%n",i);
                    } else if (!email.equals(emailCreated)) {
                        System.out.println("Wrong email!");
                        System.out.printf("Attempts remaining: %d%n",i);
                    } else {
                        System.out.println("Wrong password");
                        System.out.printf("Attempts remaining: %d%n",i);
                    }
                }
            } else {
                System.out.println("Maximum attempts reached! Please try again after an hour!");
            }


        }

        // Coffee Menu
        String[] strengths = {"Super Strong", "Strong", "Moderate", "Weak", "No caffeine", "No, thank you"};
        String[] coffeeSuperStrong = {"Doppio", "Espresso", "Vietnamese Coffee", "Death Wish Coffee", "Red Eye"};
        double[] superStrongPrices = {120, 100, 125, 500, 150};
        String[] strong = {"Cortado", "Americano", "Macchiato", "Irish Coffee", "Lungo"};
        double[] strongPrices = {150, 90, 110, 250, 120};
        String[] moderate = {"Affogato", "Cappuccino", "Mocha", "Con Panna"};
        double[] moderatePrices = {200, 100, 125, 160};
        String[] weak = {"Latte", "Flat White"};
        double[] weakPrices = {95, 150};
        String[] noCaffeine = {"Lemonade", "Strawberry"};
        double[] noCaffeinePrices = {75, 75};

        for (int i = 0; i < 40; i++) {
            System.out.println(" ");
        }



        boolean isPrefer = false;


        do {
            System.out.println("=== Welcome to Chichi Cafe ===");
            for (int i = 0; i < strengths.length; i++) {
                System.out.println(i + 1 + " " + '-' + " " + strengths[i]);
            }

            System.out.print("What type of coffee do you prefer? ");
            userPrefer = input.nextInt();
            input.nextLine();

            for (int i = 0; i < 40; i++) {
                System.out.println(" ");
            }

            while (userPrefer == 1) {
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
                System.out.println("=== Welcome to Chichi Cafe ===");
                for (int i = 0; i < coffeeSuperStrong.length; i++) {
                    System.out.println(i + 1 + " " + '-' + " " + coffeeSuperStrong[i] + " ₱" + String.format("%.2f", superStrongPrices[i]));
                }
                System.out.print("What coffee would you like to order? ");
                coffee = input.nextInt();

                input.nextLine();

                if (coffee <= coffeeSuperStrong.length) {
                    paymentMethod();
                    break;
                } else {
                    System.out.print("Invalid choice! Press 1 to go back and press 2 for types of coffee: ");
                    coffee = input.nextInt();
                    if (coffee == 1) {
                        input.nextLine();
                    } else {
                        userPrefer = 0;
                    }
                }
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
            }

            while (userPrefer == 2) {
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
                System.out.println("=== Welcome to Chichi Cafe ===");
                for (int i = 0; i < strong.length; i++) {
                    System.out.println(i + 1 + " " + '-' + " " + strong[i] + " ₱" + String.format("%.2f", strongPrices[i]));
                }
                System.out.print("What coffee would you like to order? ");
                coffee = input.nextInt();

                input.nextLine();

                if (coffee <= strong.length) {
                    paymentMethod();
                    break;
                } else {
                    System.out.print("Invalid choice! Press 1 to go back and press 2 for types of coffee: ");
                    coffee = input.nextInt();
                    if (coffee == 1) {
                        input.nextLine();
                    } else {
                        userPrefer = 0;
                    }
                }
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
            }

            while (userPrefer == 3) {
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
                System.out.println("=== Welcome to Chichi Cafe ===");
                for (int i = 0; i < moderate.length; i++) {
                    System.out.println(i + 1 + " " + '-' + " " + moderate[i] + " ₱" + String.format("%.2f", moderatePrices[i]));
                }
                System.out.print("What coffee would you like to order? ");
                coffee = input.nextInt();

                input.nextLine();

                if (coffee <= moderate.length) {
                    paymentMethod();
                    break;
                } else {
                    System.out.print("Invalid choice! Press 1 to go back and press 2 for types of coffee: ");
                    coffee = input.nextInt();
                    if (coffee == 1) {
                        input.nextLine();
                    } else {
                        userPrefer = 0;
                    }
                }
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
            }

            while (userPrefer == 4) {
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
                System.out.println("=== Welcome to Chichi Cafe ===");
                for (int i = 0; i < weak.length; i++) {
                    System.out.println(i + 1 + " " + '-' + " " + weak[i] + " ₱" + String.format("%.2f", weakPrices[i]));
                }
                System.out.print("What coffee would you like to order? ");
                coffee = input.nextInt();

                input.nextLine();

                if (coffee <= weak.length) {
                    paymentMethod();
                    break;
                } else {
                    System.out.print("Invalid choice! Press 1 to go back and press 2 for types of coffee: ");
                    coffee = input.nextInt();
                    if (coffee == 1) {
                        input.nextLine();
                    } else {
                        userPrefer = 0;
                    }
                }
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
            }

            while (userPrefer == 5) {
                for (int i = 0; i < 40; i++) {
                    System.out.println(" ");
                }
                System.out.println("=== Welcome to Chichi Cafe ===");
                for (int i = 0; i < noCaffeine.length; i++) {
                    System.out.println(i + 1 + " " + '-' + " " + noCaffeine[i] + " ₱" + String.format("%.2f", noCaffeinePrices[i]));
                }
                System.out.print("Try our non-cafe drinks! Which one would you like to order? ");
                coffee = input.nextInt();

                input.nextLine();

                if (coffee <= noCaffeine.length) {
                    paymentMethod();
                    break;
                } else {
                    System.out.print("Invalid choice! Press 1 to go back and press 2 for types of coffee: ");
                    coffee = input.nextInt();
                    if (coffee == 1) {
                        input.nextLine();
                    } else {
                        userPrefer = 0;
                    }
                }

            }

            if (userPrefer == 6) {
                System.out.println("\nSee you soon, Suki!");
                isPrefer = true;
            } else if (userPrefer > 6) {
                System.out.println("Invalid choice! Press enter to try again...");
                input.nextLine();

            }
            for (int i = 0; i < 40; i++) {
                System.out.println(" ");
            }

        } while (!isPrefer);


    }

    public static void paymentMethod() {
        Scanner input = new Scanner(System.in);

        int cardBalance, pocketMoney, eMoney ;
        String[] payMethod = {"Cash", "Card", "Qr Code"};

        for (int i = 0; i < 40; i++) {
            System.out.println(" ");
        }

        System.out.println("=== Welcome to Chichi Cafe ===");
        for (int i = 0; i < payMethod.length; i++) {
            System.out.println(i + 1 + " - " + payMethod[i]);
        }
        System.out.print("How will you pay? ");
        int userPay = input.nextInt();
        input.nextLine();


        if (userPay >= 1 && userPay <= payMethod.length) {
            String chosenMethod = payMethod[userPay - 1];
            System.out.println("You selected to pay via " + chosenMethod);
            System.out.println("Press enter to continue");
            input.nextLine();

            System.out.println("Processing " + chosenMethod + "...");
            input.nextLine();
            System.out.println("Done...");
            input.nextLine();

            for (int i = 0; i < 40; i++) {
                System.out.println(" ");
            }
        } else {
            System.out.println("Invalid choice! Returning to the menu...");
            return;
        }


    }
}
