package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {
        // [Section] Syntax of Nested If Statement

        /*
            If () { outer if
                if () { inner if
                    if () {

                    } else {

                    }
                } else {
                }
            } else {

            }
         */

        // Age Categorizer
        /* Requirements
            Age: 0 - 2 Category: Baby
            Age: 3 - 12 Category: Child
                3 - 6 -> Makulit
                6 - 12 -> Mabait
            Age: 13 - 19 Category: Teenager
         */

        Scanner sc = new Scanner(System.in);


        System.out.println("--- Age Categorizer ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        /*
        if (age >= 0 && age <= 2) {
            System.out.println("Category: Baby");
        } else if (age >= 3 && age <= 12) {
            System.out.println("Category: Child");

            // inner if statement
            if (age >= 6 && age <= 12) {
                System.out.println("Grade Schooler");
            } else {
                System.out.println("Preschooler");
            }
        } else if (age >= 13 && age <= 19) {
            System.out.println("Category: Teenager");

            // inner if
            if (age >= 13 && age <= 15) {
                System.out.println("Early Teen");
            } else {
                System.out.println("Late Teen");
            }
        } else {
            System.out.println("Invalid Input");
        } */

        // Code Minization fo getting the range
        // Validation

        // Age: 0 - 120

        //Early Exit - negating or inverting an expression

        if (!(age >= 0 && age <= 120)) {
            return;
        }
        // Early Exit

        if (age >= 0 && age <= 120) {
            if (age <= 2) {
                System.out.println("Category: Baby");
            } else if (age <= 12) {
                System.out.println("Category: Child");

            } else if (age <= 19) {
                System.out.println("Category: Teenager");

            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Age! Must be greater than 0");
        }










    }
}
