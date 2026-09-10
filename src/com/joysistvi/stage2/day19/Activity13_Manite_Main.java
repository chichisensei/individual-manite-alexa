package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class Activity13_Manite_Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean valid = false;

        System.out.println();
        System.out.println("*****************************");
        System.out.println("* User Account Registration *");
        System.out.println("*****************************");

        while (!valid) {
            System.out.println();
            System.out.print("Enter your first name: ");
            String firstName = input.nextLine();
            System.out.print("Enter your middle name: ");
            String middleName = input.nextLine();
            System.out.print("Enter your last name: ");
            String lastName = input.nextLine();
            System.out.print("Enter your address: ");
            String address = input.nextLine();
            System.out.print("Enter your email: ");
            String email = input.nextLine();
            System.out.print("Enter your password: ");
            String password = input.nextLine();

            try {
                Activity13_Manite userAccount = new Activity13_Manite(firstName, middleName, lastName, address, email, password);

                System.out.println(); // new line
                System.out.println("------------------------");
                System.out.println("| User Account Created |");
                System.out.println("------------------------");
                System.out.printf("%nFull name: %s %s %s", userAccount.getFirstName(), userAccount.getMiddleName(), userAccount.getLastName());
                System.out.println("\nAddress: " + userAccount.getAddress());
                System.out.println("Email: " + userAccount.getEmail());

                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }





    }
}
