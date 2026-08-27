package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {

    public static void main(String[] args) {

        // [Syntax] While-Loop
        /*
            initialization (optional)
            while (condition) {
                statement / body of the loop
                inc / dec (optional)
            }
         */
        // Print numbers from 1 - 10

        /*int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        } */

        /*
        While Loop - Used when the number of repetition is unknown in advance
         */
        // flagging?
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = false;
        while (!isRunning) {
            System.out.print("Type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("Program stopped");
                isRunning = true;
            } else {
                System.out.println("Try again");
            }
        }
        // flag -> used to track / mark a variable whether a specific condition or event has occured
    }
}
