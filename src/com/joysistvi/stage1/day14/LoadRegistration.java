package com.joysistvi.stage1.day14;
/*
    Focuses on:
    parameters & arguments
    SOC principle
    Code Reusability
    Avoid Code Duplication
 */

import java.util.Scanner;

public class LoadRegistration {

    // *143#
    // *123#
    static Scanner scanner = new Scanner(System.in);
    static double balance = 500;

    public static void main(String[] args) {
        validateUssdCode();
        mainMenu();
    }

    public static void validateUssdCode() {
        System.out.println("\nDial *143# to access Globe Services");

        System.out.print("Enter USSD code: ");
        String ussdCode = scanner.nextLine().trim();


        if (!ussdCode.equals("*143#")) {
            System.out.println("\nInvalid USSD Code! Exiting...");
            System.exit(0); // Exit JVM
        }

    }

    public static void mainMenu() {
        System.out.println("\n~~~ Load Registration ~~~");
        System.out.println("    [1] Unli Text");
        System.out.println("    [2] Unli Call");
        System.out.println("    [3] Go Surf");
        System.out.println("    [4] Check Balance");
        System.out.println("    [5] Borrow Load");
        System.out.println("    [0] Exit");

        System.out.print("Enter choice: ");
        int mainMenuChoice = scanner.nextInt();



        switch (mainMenuChoice) {
            case 1:
                unliTextPromo();
            case 0:
                exitFunction();
        }
    }

    public static void unliTextPromo() {
        System.out.println("\n### Enjoy Unli Text ###");
        System.out.println("    [1] 1 Day for 1gb for only P10");
        System.out.println("    [2] 3 Days for 2gb for only P30");
        System.out.println("    [3] 5 Days for 3gb for only P50");
        System.out.println("    [4] Back");
        System.out.println("    [0] Exit");
        System.out.print("Enter choice: ");
        int unliTextChoice = scanner.nextInt();

        switch (unliTextChoice) {
            case 1:
                subscriptionConfirmation(1,10,1);
                break;
            case 2:
                subscriptionConfirmation(3,30,2);
                break;
            case 3:
                subscriptionConfirmation(5,50,3);
                break;
        }

    }

    public static void subscriptionConfirmation(int days, int price, int gb) {
        System.out.printf("\nGet %d Day/s Unli Text Promo with %dgb shareable data for only P%d%n",days,gb,price);

        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Back");
        System.out.println("    [3] Exit");
        System.out.print("Enter choice: ");
        int subChoice = scanner.nextInt();
        if (subChoice == 1) {
            System.out.println("You are now subscribed to Unli Text Promo.......");
            return;
        } else if (subChoice == 2) {
            unliTextPromo();

        } else if (subChoice == 3) {
            exitFunction();
        }
    }

    public static void exitFunction() {
        System.out.println("Are you sure that you really want to exit?");
        System.out.print("Press Y/y:");
        String choice = scanner.nextLine();

        if (choice.equals("y")) {
            System.exit(0);
        }

    }










//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//        greet(name);
//    }
//
//    public static void greet(String name) {
//        System.out.println("Hello " + name);
//    }
}
