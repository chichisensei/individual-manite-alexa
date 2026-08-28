package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SirJaredLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        int maxAttempts = 3;

        boolean isLoggedIn = false;

        System.out.println("=== Log In ===");
        //                      1 <= 3

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Attempt " + attempt + " of " + maxAttempts);

            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            boolean emailCorrect = loginEmail.equals(email);
            boolean passCorrect = loginPass.equals(password);


            if (emailCorrect && passCorrect) {
                System.out.println("\nLogin Successfully!");
                isLoggedIn = true;
                break; // break / stop the loop
            } else if (!emailCorrect && !passCorrect){ // email and password are incorrect
                System.out.println("\nInvalid Username and Password!");
            } else if (!emailCorrect) { //  incorrect email
                System.out.println("\nInvalid email! Try again.");
            } else { // incorrect password
                System.out.println("\nInvalid password! Try again.");
            }
        }

        if (!isLoggedIn) {
            System.out.println("\nAccount locked. Too many failed attempts");
            return;
        }




        // Invalid Username
        // Invalid Password

    }
}

/*
     String       Number
    .equals()     ==
 */
