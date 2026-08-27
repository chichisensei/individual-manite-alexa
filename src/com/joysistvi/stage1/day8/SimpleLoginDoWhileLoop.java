package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLoginDoWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String email = "chichi@gmail.com";
        String password = "chichi14";

        boolean isLoggedIn = false;
        do {
            System.out.print("Enter your email: ");
            String userEmail = input.nextLine();
            System.out.print("Enter your password: ");
            String userPass = input.nextLine();

            if (userEmail.equals(email) && userPass.equals(password)) {
                System.out.println("Login Successful!");
                isLoggedIn = true;
            } else {
                if (!userEmail.equals(email) && !userPass.equals(password)) {
                    System.out.println("Invalid email and password!");
                } else if (!userEmail.equals(email)) {
                    System.out.println("Invalid email!");
                } else {
                    System.out.println("Invalid password!");
                }
            }
        } while (!isLoggedIn);
    }
}
