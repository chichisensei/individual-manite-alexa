package com.joysistvi.stage2.day17;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Activity12_Manite {

    static Scanner input = new Scanner(System.in);

    // method to print your full name and age OK
    // method to print your name 50 times OK
    // method to print a certain word in reverse order OK
    // method to identify if a person is a voter or not OK

    // method to identify if a number is odd or even OK! LOOP?
    // method to get the square root of a certain variable OK
    //a method to get the power of a number using base and exponent OK
    // method to print a random number between 1 & 100 OK
    // a method to get the area of a circle using the given radius
    // method to get the length of a certain word OK



    //Adventure game?
    // Ask user's info
    // pick user character
    // display coins and health

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int randomIndex = (int) Math.floor(Math.random() * numbers.length);
    static int randomNumbers = (int) Math.floor(Math.random() * 1000) + 1;
    static int maxHealth = 50;
    static int baseHealth = maxHealth;


    public static void main(String[] args) throws InterruptedException {

//        System.out.print("Enter your name: ");
//        String name = input.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = input.nextInt();
//
//        printNameAge(name,age);
//        identifyVoter(age);
//        printName50(name);

        // Start of Game
//        startGame();
        guessTheWord();



//        printNameReverse(name);

//        testAnsi();



    }

    public static void printNameAge(String name, int age) {
        System.out.printf("%nName: %s%n" +
                "Age: %d%n", name,age);

        System.out.println();


    }

    public static void printName50(String name) throws InterruptedException{
        printNameReverse(name);

        String[][] names = new String[5][10];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++){
                names[i][j] = name;

            }
        }


        for (String[] rows : names) {
            for (String columns : rows) {
                System.out.print(columns + " ");
                System.out.flush();

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Move back to the first row
        System.out.print("\033[5A");

// Clear the 5 rows
        for (int i = 0; i < 5; i++) {
            System.out.print("\r");      // Go to the start of the line
            System.out.print("\033[2K"); // Clear the current line

            if (i < 4) {
                System.out.print("\033[1B"); // Move down to the next line
            }
        }




        System.out.flush();





    }

    public static void printNameReverse(String name) {
        if (name == null) return;
        System.out.print("\r");
        int count = 0;
        for (int i = name.length() - 1; i >= 0; i--) {
            count++;
            System.out.print(name.charAt(i));
            System.out.flush();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < name.length(); i++) {
            System.out.print("\b \b");
            System.out.flush();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.print("Good day, ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            System.out.flush();


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print("! Welcome to the Adventure Game!\n\n");

    }

    public static void identifyVoter(int age) {
        if (age >= 18) {
            System.out.println("A voter has enter the realm!");
        } else if (age >= 0) {
            System.out.println("Who are you, youngster!? You are forbidden in the realm!");
        }
    }

    // Start Game
    public static void startGame() {
        String banner = "Welcome to your first quest!\n"
                      + "Find out if the number "
                      + numbers[randomIndex]
                      + "\nis an [ 1 ] odd or [ 2 ] even number\n",
               banner2 = "\nWelcome to your second quest!\n"
                       + "Find out if the number "
                       + randomNumbers
                       + "\nis a [ 1 ] Perfect square or [ 2 ] Not a Perfect Square\n",
               banner3 = "\nWelcome to your third quest!\n"
                       + "Find out the derivative of \\(f(x) = 3x^3 - 5x^2 + 39x + 2\\)"
                       + "\nif x = 4\n",
               banner4 = "\nWelcome to your fourth quest!\n"
                       + "Guess a random number ranging"
                       + "\nfrom 1 - 100\n";



        System.out.println(banner);

        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        oddOrEven(numbers[randomIndex], choice);

        System.out.println(banner2);
        System.out.print("Enter choice: ");
        choice = input.nextInt();
        findSqrt(randomNumbers, choice);

        System.out.println(banner3);
        System.out.print("Enter your answer: ");
        int answer = input.nextInt();
        printDerivative(answer);

        System.out.println(banner4);
        guessingQuest();



    }

    // Quest 1
    private static int oddOrEven(int number, int choice) {
        while (choice < 0 || choice > 2) {
            System.out.println("Invalid Input!");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
        }
        System.out.print((number % 2 == 0 && choice == 2) ? "Yes, correct! It's an even number" : (number % 2 != 0 && choice == 1) ? "Yes, correct! It's an odd number!" : "Wrong! Try Again!");


        return number;

    }
    // Quest 2
    private static void findSqrt(double number, int choice) {
        while (choice < 0 || choice > 2) {
            System.out.println("Invalid Input!");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
        }

        int root = (int) Math.sqrt(number);
        boolean isPerfectSquare = ((Math.pow(root,2)) == number);

        System.out.print(((isPerfectSquare && choice == 1) || !isPerfectSquare && choice == 2) ? "Yes, that's correct!" : "Wrong!" );

    }

    //healing?
    // Quest 3
    private static double f(double x) {
        return 3 * Math.pow(x, 3) - 5 * Math.pow(x, 2) + 39 * Math.pow(x, 1) + 2;

    }

    public static int getIntDerivative(double x) {
        double h = 0.00001;

        double decimalDerivative = (f(x + h) - f(x - h)) / (2 * h);

        return (int) Math.round(decimalDerivative);
    }

    public static void printDerivative(int answer) {
        double pointX = 4.0;
        int slope = getIntDerivative(pointX);
        if (answer != getIntDerivative(pointX)) {
            System.out.println("Wrong answer!");
        } else {
            System.out.println("Correct! The integer derivative at x=4 is: " + slope);
        }

    }

    private static int getRandomNumber(int max, int min) {
        return (int) Math.floor(Math.random() * max) + min;
    }

    // Quest 4
    public static void guessingQuest() {

        String clue = (getRandomNumber(100,1) > 100) ? "Invalid input!"
                    : (getRandomNumber(100,1) > 90) ? "The clue: Number is between 91 & 100"
                    : (getRandomNumber(100,1) > 80) ? "The clue: Number is between 81 & 90"
                    : (getRandomNumber(100,1) > 70) ? "The clue: Number is between 71 & 80"
                    : (getRandomNumber(100,1) > 60) ? "The clue: Number is between 61 & 70"
                    : (getRandomNumber(100,1) > 50) ? "The clue: Number is between 51 & 60"
                    : (getRandomNumber(100,1) > 40) ? "The clue: Number is between 41 & 50"
                    : (getRandomNumber(100,1) > 30) ? "The clue: Number is between 31 & 40"
                    : (getRandomNumber(100,1) > 20) ? "The clue: Number is between 21 & 30"
                    : (getRandomNumber(100,1) > 10) ? "The clue: Number is between 11 & 20"
                    : (getRandomNumber(100,1) > 0) ? "The clue: Number is between 1 & 10" : "The clue: Number is a positive integer!";

        System.out.println(clue);

        System.out.print("Enter your answer: ");
        int answer = input.nextInt();

        System.out.println((answer != getRandomNumber(100, 1)) ? "Wrong!" : "Correct!");
    }

    // Quest 5
    private static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void findTheArea() {
        double radius = 7;
        double correctAnswer = circleArea(radius);

        System.out.print("Enter the area: ");
        double answer = input.nextDouble();

        String open = (Math.abs(answer - correctAnswer) < 0.01) ? "Correct!" : "Wrong";

        System.out.println(open);
    }



    // Quest 6
    public static void guessTheWord() {
        String secretWord = "Yeshua", guess;

        System.out.println("Guess the Word");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextLine().trim().toLowerCase();

            if (getWordLength(guess) != getWordLength(secretWord)) {
                System.out.println("The word must have " + getWordLength(secretWord) + " letters!");
                continue;
            }

            StringBuilder hint = new StringBuilder();

            for (int i = 0; i < getWordLength(secretWord); i++) {
                if (guess.charAt(i) == secretWord.charAt(i)) {
                    hint.append(secretWord.charAt(i));
                } else {
                    hint.append("_ ");
                }
            }

            if (guess.equals(secretWord)) {
                System.out.println("Correct! The word is " + secretWord + "!");
            } else {
                System.out.println("Hint: " + hint);
            }

        } while (!guess.equals(secretWord));
    }

    private static int getWordLength(String word) {
        return word.length();
    }


    public static void testAnsi() throws InterruptedException {
        System.out.println("Line 1");
        System.out.println("Line 2");
        Thread.sleep(1000);

        System.out.print("\033[2A"); // Move up 2 lines
        System.out.print("\033[2K"); // Clear line 1
        System.out.print("\n");
        System.out.print("\033[2K"); // Clear line 2
        System.out.flush();
    }

}
