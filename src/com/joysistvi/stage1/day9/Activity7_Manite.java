package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_Manite {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            int number;

            boolean isRepeat = false;

        System.out.println("\n=== Welcome to the Multiplication Table ===");

            while (!isRepeat) {
                System.out.print("\nType a number to display a multiplication table: ");

                while (!input.hasNextInt()) {
                    System.out.print("\nError! Please enter a number!\n");
                    input.next();
                    System.out.print("\nType a number to display a multiplication table: ");
                }
                number = input.nextInt();

                for (int i = number; i <= number; i++) {
                    System.out.println("\nMultiplication Table of " + i);
                    for (int j = 0; j <= 10; j++) {
                        int product = i * j;
                        System.out.println(i + " " + '*' + " " + j + " " + '=' + " " + product);
                    }
                }
                System.out.printf("\n1 - Go back\t2 - Exit:%n");

                while (!input.hasNextInt()) {
                    System.out.print("Error! Please enter a number!");
                    input.next();
                    System.out.printf("\n1 - Go back\t2 - Exit:%n");
                }
                number = input.nextInt();

                while (number < 1 || number > 2) {
                    System.out.print("Invalid choice! Please choose between 1 and 2: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Error! Please enter a number!");
                        input.next();
                    }
                    number = input.nextInt();
                }

                if (number == 2) {
                    isRepeat = true;
                    System.out.println("\n=== Have fun doing Math, Sweetie! ===");
                }
            }


    }
}
