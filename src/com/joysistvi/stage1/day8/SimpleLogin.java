package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "chichi@gmail.com";
        String password = "chichi14";

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login successful!");

                isLoggedIn = true;
            } else {
                if (!loginEmail.equals(email) && !loginPass.equals(password)) {
                    System.out.println("Invalid email and password");
                } else if (!loginEmail.equals(email)) {
                    System.out.println("Invalid email");
                } else {
                    System.out.println("Invalid password");
                }
            }
        }


    }
}
