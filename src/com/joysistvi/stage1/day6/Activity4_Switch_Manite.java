package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_Switch_Manite {

    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);

        // Initialization
        String mainTitle = "=== Student Portal Menu ===";
        String viewGrades = "1. View Grades";
        String enrollSubjects = "2. Enroll Subjects";
        String payTuition = "3. Pay Tuition";
        String exit = "4. Exit";
        String selectedOption = "";

        // Print
        System.out.println(mainTitle);
        System.out.printf("%s%n%s%n%s%n%s%n",viewGrades,enrollSubjects,payTuition,exit);

        System.out.print("Enter your choice (1-4): ");
        int input = choice.nextInt();

        // Conditional Using Switch Statement
        switch (input) {
            case 1:
                selectedOption = "You selected Option 1: View Grades";
                break;
            case 2:
                selectedOption = "You selected Option 2: Enroll Subjects";
                break;
            case 3:
                selectedOption = "You selected Option 3: Pay Tuition";
                break;
            case 4:
                selectedOption = "You selected Option 4: Exit";
                break;
            default:
                selectedOption = "Invalid Choice. Please try again.";
        }

        System.out.println("\n" + selectedOption);

        choice.close();


    }
}
