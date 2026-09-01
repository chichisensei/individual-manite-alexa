package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_Manite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // main title with header
        String border = "=".repeat(51), averageCalc = "Average Calculator", space = " ".repeat(17), gradesReport = "Grades Report";


        System.out.printf("%s%n%s%s%n%s%n",border,space,averageCalc,border);

        // number of data?
        System.out.print("Enter the number of students: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please type an integer!");
            input.next();
            System.out.print("Enter the number of students: ");
        }
        int numStudents = input.nextInt();


        System.out.print("Enter the number of subjects: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please type an integer!");
            input.next();
            System.out.print("Enter the number of subjects: ");
        }
        int numSubjects = input.nextInt();

        int totalWidth = 15 + (12 * numSubjects) + 10;
        border = "=".repeat(totalWidth);

        String calcSpace = " ".repeat(Math.max(0, (totalWidth - averageCalc.length()) / 2));
        String reportSpace = " ".repeat(Math.max(0, (totalWidth - gradesReport.length()) / 2));

        System.out.printf("%s%n%s%s%n%s%n", border, calcSpace, averageCalc, border);


        // arrays -> multi-dimensional
        String[][] subjects = new String[1][numSubjects];
        String[][] dataTable = new String[numStudents][numSubjects + 2];



        // subject names
        System.out.println("\nEnter subject names: ");
        for (int i = 0; i < numSubjects; i++) {
            while (true) {
                input.nextLine();
                System.out.printf("Subject %d: ",(i + 1));
                String temporary = input.nextLine();

                System.out.print("\n[1] Edit? | [2] Proceed? ");
                int choice = input.nextInt();


                if (choice == 2) {
                    subjects[0][i] = temporary;
                    break;
                } else {
                    System.out.print("Going back...");
                }

            }

        }


        double sum;
        // student data and calculations
        for (int i = 0; i < numStudents; i++) {

            while (true) {
                sum = 0;

                System.out.println();
                input.nextLine();
                System.out.printf("Name of Student %d: ",(i+1));
                dataTable[i][0] = input.nextLine();

                System.out.println("Enter grades for each subject:");

                for (int j = 0; j < numSubjects; j++) {
                    System.out.printf("%s: ",subjects[0][j]);
                    double grade = input.nextDouble();
                    dataTable[i][j+1] = String.valueOf(grade);
                    sum += grade;
                }

                System.out.print("[1] - Edit? | [2] - Proceed? ");
                int choice = input.nextInt();

                if (choice != 1) {
                    break;
                }


            }
            double average = sum / numSubjects;
            dataTable[i][numSubjects + 1] = String.format("%.2f",average);
        }

        // data table
        System.out.println();
        System.out.printf("%s%n%s%s%n%s%n", border, reportSpace, gradesReport, border);

        System.out.printf("%-15s","Student");

        for (String subject : subjects[0]) {
            System.out.printf("%-12s", subject);
        }
        System.out.printf("%-10s%n", "Average");
        System.out.println(border);

        //traverse student data - rows
        for (String[] studentRow : dataTable) {
            System.out.printf("%-15s", studentRow[0]);

            for (int j = 1; j <= numSubjects; j++) {
                double val = Double.parseDouble(studentRow[j]);
                System.out.printf("%-12.0f",val);
            }
            System.out.printf("%-10s%n",studentRow[numSubjects + 1]);
        }
        System.out.print(border);

        input.close();
    }
}
