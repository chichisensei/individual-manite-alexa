package com.joysistvi.stage1.Games;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();

        int numberGuess = rand.nextInt(10) + 1;
        int playerGuess = 0;
        int attempts = 0;
        int max_attempts = 3;

        System.out.println("=== Welcome to Number Guessing Game! ===");
        System.out.print("Can you guess the number correctly between 1-10?");

        do {
            int remainingAttempt = max_attempts - attempts;

            System.out.printf("%nYou only have %d remaining attempts left! Enter a number: ",remainingAttempt);
            if (userInput.hasNextInt()) {
                playerGuess = userInput.nextInt();
                attempts++;

                if (playerGuess < numberGuess && attempts < max_attempts) {
                    System.out.println("Too low!");
                } else if (playerGuess > numberGuess && attempts < max_attempts) {
                    System.out.println("Too high!");
                }
            } else {
                System.out.println("Invalid input! Please enter a number!");
                userInput.next();
            }

        } while (playerGuess != numberGuess && attempts < max_attempts);

        if (playerGuess == numberGuess) {
            System.out.println("Correct! You won!");
        } else {
            System.out.printf("You lose! The correct number was %d",numberGuess);
        }

        userInput.close();

    }
}
