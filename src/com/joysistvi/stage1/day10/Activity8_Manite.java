package com.joysistvi.stage1.day10;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Activity8_Manite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        boolean isNumber = false;

        //Enter Numbers to display
        while(!isNumber) {
            System.out.println("\nEnter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("Numbers %d: ",(i + 1));
                numbers[i] = input.nextInt();
                input.nextLine();
            }
            // Displaying user's input
            System.out.print("\nYou entered: \n");
            int index = 0;
            for (int number : numbers) {
                System.out.printf("Index %d: %d%n",index,number);
                index++;
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double average = (double) sum / numbers.length;


            boolean isRepeat = false;
            int userInput;
            while (!isRepeat) {
                // printing sum, average, highest & lowest number

                int highestNumber = numbers[0];
                int lowestNumber = numbers[0];
                // [5,10,15,20,25] -> 10>5 true, 15>5 true, 20>5 true, 25>5 true --> once done comparing, the comp will pick the highest number that it is bigger than index[0]
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > highestNumber) {
                        highestNumber = numbers[i];
                    } else if (numbers[i] < lowestNumber) {
                        lowestNumber = numbers[i];
                    }
                }

                System.out.print("\nPress 1 to get the sum, \n2 for the average, \n3 for both, \n4 for the highest number, and \n5 for the lowest number: ");
                userInput = input.nextInt();

                if (userInput == 3) System.out.printf("%nSum = %d%nAverage = %.2f",sum,average);
                if (userInput == 1) System.out.printf("%nSum = %d",sum);
                if (userInput == 2) System.out.printf("%nAverage = %.2f",average);
                if (userInput == 4) System.out.printf("%nThe highest number above is %d",highestNumber);
                if (userInput == 5) System.out.printf("%nThe lowest number above is %d",lowestNumber);

                System.out.print("\nType 1 to go back, 2 for exit, and 3 for a guessing game: ");
                userInput = input.nextInt();

                if (userInput == 2) {
                    isNumber = true;
                    break;
                } else if (userInput == 3) {
                    guessingGame();
                    isRepeat = true;
                }

            }
        }

    }
    public static void guessingGame() {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int[] compNumbers = new int[3];

        int[] numbers = new int[3];
        int attempt = 0;
        int maxAttempts = 5;
        boolean hasWon = false;

        for (int i = 0; i < compNumbers.length; i++) {
            compNumbers[i] = rand.nextInt(10) + 1;
        }

        do {
            int remainingAttempts = maxAttempts - attempt;

            System.out.printf("You have %d attempts remaining!%n%nGive me three numbers: %n",remainingAttempts);
            for (int i = 0; i < numbers.length; i++) {
                while (!input.hasNextInt()) {
                    input.nextInt();
                    System.out.print("Invalid input! Please enter a number: ");
                }
                numbers[i] = input.nextInt();
            }

            attempt++;

            int correctGuess = 0;
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("Number %d: ",(i + 1));
                if (numbers[i] < compNumbers[i]) {
                    System.out.println("Too low!");
                } else if (numbers[i] > compNumbers[i]) {
                    System.out.println("Too high!");
                } else {
                    System.out.print("Correct!\n");
                    correctGuess++;
                }
            }

            if (correctGuess == numbers.length) {
                hasWon = true;
            }


        } while (!hasWon && attempt < maxAttempts);

        if (hasWon) {
            System.out.println("\nCongratulations! You won!");
        } else {
            System.out.println("\nGame Over! The correct numbers were: " + Arrays.toString(compNumbers));
        }

        System.out.print("Play again? Type 1 to play, and type 2 to go back: ");
        int userChoice = input.nextInt();

        if (userChoice != 1) {
            return;
        }
        guessingGame();

    }
}
