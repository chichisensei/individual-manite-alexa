package com.joysistvi.stage1.testingCode;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestingCode {
    public static final String CYAN = "\u001B[36m";
    public static final String RESET = "\u001B[0m";
    static Scanner input = new Scanner(System.in);
    static int balance = 0;
    public static void main(String[] args) {

        int password = 123456;


        int userPin;


        while (true) {
            System.out.println("Main Menu...");
            System.out.print("Click enter to proceed...");


            do {
                input.nextLine();
                System.out.print("Enter PIN: ");
                userPin = input.nextInt();


                String[][] menu = {
                        {"[ 1 ] Balance", "[ 2 ] Deposit"},
                        {"[ 3 ] Wihdraw", "[ 4 ] Exit"}
                };

                for (int i = 0; i < menu.length; i++) {
                    for (int j = 0; j < menu[i].length; j++) {
                        System.out.print(menu[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.print("Enter choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1 -> displayBalance(password, userPin);
                    case 2 -> displayDeposit(password, userPin);
                    case 3 -> displayWithdraw(password, userPin);
                    case 4 -> System.exit(0);
                    default -> System.out.println("Invalid input! Try again!");
                }


            } while (userPin != password);
        }






    }


    public static void displayBalance(int password, int userPin) {

        while (true) {
            if (userPin != password) {
                System.out.println("Invalid pin!");
                return;
            }

            System.out.println("Your balance is...." + balance);

            return;
        }


    }

    public static void displayDeposit(int password, int userPin) {

        while (true) {

            System.out.print("Enter valid amount: ");
            int amount = input.nextInt();

            if (userPin != password) {
                System.out.println("Invalid pin!");
                return;
            }

            balance += amount;

            System.out.println("Your current balance is" + balance);

            return;


        }

    }

    public static void displayWithdraw(int password, int userPin) {

        while (true) {
            System.out.print("Enter amount to withdraw: ");
            int amount = input.nextInt();

            if (userPin != password) {
                System.out.println("Invalid pin!");
                return;
            }

            balance -= amount;

            System.out.println("Your new balance is " + balance);
        }



    }
}
