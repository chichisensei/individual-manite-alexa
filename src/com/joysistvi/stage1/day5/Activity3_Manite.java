package com.joysistvi.stage1.day5;

import java.util.Scanner;

public class Activity3_Manite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            // Task 2
            String taskTwo = "--- Task 2: Event Entry Check ---";
            String task2 = "Allowed to enter the event: ";

            System.out.println(taskTwo);
            System.out.printf("Enter your age: ");
            int age = input.nextInt();
            System.out.printf("You have a valid ID? (true/false): ");
            boolean hasValidID = input.nextBoolean();

            input.nextLine();

            String task1Result = (age >= 18 && hasValidID) ? "Yes" : "No";

            System.out.println(task2 + task1Result + "\n");

            System.out.print("Proceed to Task 3? (Yes/No): ");
            choice = input.nextLine();

            if(!choice.equalsIgnoreCase("Yes")) System.out.println("Restarting Task 2...\n");

        } while(!choice.equalsIgnoreCase("Yes"));
        System.out.println("\nMoving to Task 3...");

        do {
            // Task 3
            String taskThree = "--- Task 3: Class Status Check ---";
            String task3 = "Are there no classes today? ";

            System.out.println(taskThree);
            System.out.printf("Today is weekend? (true/false): ");
            boolean isWeekend = input.nextBoolean();
            System.out.printf("Today is holiday? (true/false): ");
            boolean isHoliday = input.nextBoolean();

            input.nextLine();

            String result = (isWeekend || isHoliday) ? "Yes, no classes." : "There are classes today.";
            System.out.println(task3 + result + "\n");

            System.out.print("Proceed to Task 4? (Yes/No): ");
            choice = input.nextLine();

            if(!choice.equalsIgnoreCase("Yes")) System.out.println("Restarting Task 3...\n");
        } while(!choice.equalsIgnoreCase("Yes"));
        System.out.println("\nMoving to Task 4...");

        do {
            //task 4
            String taskFour = "--- Task 4: Pass or Fail Check ---";
            String task4 = "Result: ";

            System.out.println(taskFour);
            System.out.printf("Score: ");
            int score = input.nextInt();

            input.nextLine();

            String gradeResult = (score >= 75) ? "Passed" : "Failed";
            System.out.println(task4 + gradeResult + "\n");

            System.out.print("Proceed to Task 5? (Yes/No): ");
            choice = input.nextLine();

            if(!choice.equalsIgnoreCase("Yes")) System.out.println("Restarting Task 4...\n");

        } while(!choice.equalsIgnoreCase("Yes"));
        System.out.println("\nMoving to Task 5...");

        do {
            //task 5
            String taskFive = "--- Task 5: Larger Number Check ---";
            String task5 = "The larger number is: ";

            System.out.println(taskFive);
            System.out.print("Number 1: ");
            int num = input.nextInt();
            System.out.print("Number 2: ");
            int num2 = input.nextInt();

            input.nextLine();

            int largerNumber = (num > num2) ? num : num2;

            System.out.println(task5 + largerNumber);

            System.out.print("\nEnd Task 5? (Yes/No): ");
            choice = input.nextLine();

            if(!choice.equalsIgnoreCase("Yes")) System.out.println("Restarting Task 5...\n");

        } while(!choice.equalsIgnoreCase("Yes"));
        System.out.println("\nEnding task 5...");

        input.close();
    }
}
