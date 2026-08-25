package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_If_Manite {

    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);

        // Initialization
        String mainTitle = "=== Main Menu ===";
        String startGame = "1. Start Game";
        String loadGame = "2. Load Game";
        String settings = "3. Settings";
        String exit = "4. Exit";

        String selectedOption = "";

        // Print
        System.out.println(mainTitle);
        System.out.printf("%s%n%s%n%s%n%s%n",startGame,loadGame,settings,exit);

        System.out.print("Enter your choice (1-4): ");
        int input = choice.nextInt();



        // Conditional Statement Using If-else if Ladder
        if (input == 1) {
            selectedOption = "You selected Option 1: Start Game";
        } else if (input == 2) {
            selectedOption = "You selected Option 2: Load Game";
        } else if (input == 3) {
            selectedOption = "You selected Option 3: Settings";
        } else if (input == 4) {
            selectedOption = "You selected Option 4: Exit";
        } else {
            selectedOption = "Invalid choice. Please try again.";
        }

        System.out.println("\n" + selectedOption);

        choice.close();

    }
}
