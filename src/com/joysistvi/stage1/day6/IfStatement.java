package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // [Section] Simple-if
        /*

            Syntax:
            if (condition) {
                block of code
            }

         */
        // Program that identifies if a temperature is fever or not
        float temp = 37;
        String result = "";
        if (temp >= 36.6) {
            result = "fever";
        }

        System.out.println(result + "\n");

        // [Section] If-else statement
        /*
            Syntax:
            if (condition) {
                trueblock
                } else {
                block statement
                }
         */

        float temp2 = 37;
        String result2 = "";
        if (temp2 >= 36.6) {
            result2 = "fever";
        } else {
            result2 = "normal temperature";
        }
        System.out.println(result2 + "\n");

        // [Section] if-else ladder statement
        /*
            Syntax:
            if (condition) {
            // true
            } else if (condition 2) {
            // true
            } else if (condition 3) {
            // true
            } else if (condition 4) {
            // true
            }
            else if (condition 5) {
            // true
            } else {
            // false
            }

         */
        System.out.print("Enter a number: ");
        int day = sc.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Input!");
        }
        System.out.println("Result: " + day);

        // Switch

        String month = "December";

        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println("First Quarter of the year");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println("Second Quarter of the year");
                break;
            case "July":
            case "August":
            case "September":
                System.out.println("Third Quarter of the year");
                break;
            case "October":
            case "November":
            case "December":
                System.out.println("Fourth Quarter of the year");
                break;
            default:
                System.out.println("Invalid Input! Please pick a valid month!");

        }

        //next topic

    }
}
