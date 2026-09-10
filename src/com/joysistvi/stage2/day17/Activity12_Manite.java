package com.joysistvi.stage2.day17;

import java.util.Scanner;

public class Activity12_Manite {

    static Scanner input = new Scanner(System.in);

    // method to print your full name and age OK
    // method to print your name 50 times OK
    // method to print a certain word in reverse order OK
    // method to identify if a person is a voter or not OK

    // method to identify if a number is odd or even OK!
    // method to get the square root of a certain variable OK
    //a method to get the power of a number using base and exponent OK
    // method to print a random number between 1 & 100 OK
    // a method to get the area of a circle using the given radius OK
    // method to get the length of a certain word OK



    //Adventure game?
    // Ask user's info
    // pick user character
    // display coins and health

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int randomIndex = (int) Math.floor(Math.random() * numbers.length);
    static int randomNumbers = (int) Math.floor(Math.random() * 1000) + 1;
    static int maxHealth = 10;
    static int baseHealth = maxHealth;
    static String userCharacter;


    public static void main(String[] args) throws InterruptedException {

        System.out.print("\nEnter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Pick your character: [ 1 ] 💁‍♀️ [ 2 ] 💁‍♂️");
        int userPick = input.nextInt();
        System.out.println("You pick: " + displayCharacter(userPick));

        printNameAge(name,age);
        identifyVoter(age);
        printName50(name);
        startGame();






    }

    public static void printNameAge(String name, int age) {
        System.out.printf("^^^^^^^^^^^^^^^^^^");
        System.out.printf("%nName: %s%n" + "Age: %d%n", name,age);
        System.out.printf("^^^^^^^^^^^^^^^^^^");

        System.out.println();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static String displayCharacter(int choice) {
       return (choice > 2 || choice < 0) ? "Invalid input!" : (choice == 1) ? userCharacter = "💁‍♀️" : "💁‍♂️";
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
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void identifyVoter(int age) {
        if (age >= 18) {
            System.out.println("A voter has enter the realm!");
        } else if (age >= 0) {
            System.out.println("Who are you, youngster!? You are forbidden in the realm!");
        }
    }

    // Start Game - banner5 & banner6
    public static void startGame() {
        String banner = "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                      + "\nWelcome to your first quest! " + userCharacter
                      + "\nFind out if the number "
                      + numbers[randomIndex]
                      + "\nis an [ 1 ] odd or [ 2 ] even number\n"
                      + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n",
               banner2 = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                       + "\nWelcome to your second quest!" + userCharacter
                       + "\nFind out if the number "
                       + randomNumbers
                       + "\nis a [ 1 ] Perfect square or [ 2 ] Not a Perfect Square\n"
                       + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n",
               banner3 = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                       + "\nWelcome to your third quest!" + userCharacter
                       + "\nFind out the derivative of \\(f(x) = 3x^3 - 5x^2 + 39x + 2\\)"
                       + "\nif x = 4\n"
                       + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n",
               banner4 = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                       + "\nWelcome to your fourth quest!" + userCharacter
                       + "\nGuess a random number ranging"
                       + "\nfrom 1 - 100\n"
                       + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n",
               banner5 = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\nWelcome to your fifth quest!" + userCharacter
                        + "\nThe Ancient Gate blocks your path.\n"
                        + "\"Only those who know the area of \nthe sacred circle may pass.\""
                        + "\nRadius: 4\n"
                        + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n",
               banner6 = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                       + "\nWelcome to your final quest!" + userCharacter
                       + "\nA golden gate bars your path.\n"
                       + "An angel declares that you should\nspeak your savior's name\nand the gates will open for you.\n"
                       + "Each correct letter will be revealed.\nGuess until the entire name is complete.\n"
                       + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n";



        System.out.println(banner + displayHealth());
        System.out.print("\nEnter choice: ");
        int choice = input.nextInt();
        oddOrEven(numbers[randomIndex], choice);

        System.out.println(banner2 + displayHealth());
        System.out.print("\nEnter choice: ");
        choice = input.nextInt();
        findSqrt(randomNumbers, choice);

        System.out.println(banner3 + displayHealth());
        System.out.print("\nEnter your answer: ");
        int answer = input.nextInt();
        printDerivative(answer);

        System.out.println(banner4 + displayHealth());
        guessingQuest();

        System.out.println(banner5 + displayHealth());
        System.out.print("Enter the area: ");
        double area = input.nextDouble();
        findTheArea(area);

        System.out.println(banner6 + displayHealth());
        guessTheWord();


    }

    // Quest 1 complete
    private static void oddOrEven(int number, int choice) {

        boolean isWinning = false;

        do {
            if (choice < 1 || choice > 2) {
                System.out.println("Invalid Input!");
                continue;
            }

            if (number % 2 == 0 && choice == 2) {
                System.out.print("Yes, correct! It's an even number\n");
                System.out.println(displayHealth());
                isWinning = true;
            } else if (number % 2 != 0 && choice == 1) {
                System.out.println("Yes, correct! It's an odd number!\n");
                System.out.println(displayHealth());
                isWinning = true;
            } else {
                System.out.println("Wrong! Try Again!");
                takeDamage();
                System.out.println(displayHealth());

            }

            if (!isWinning) {
                System.out.println("\nFind out if the number " + numbers[randomIndex] + "\nis an [ 1 ] odd or [ 2 ] even number\n");
                System.out.println(displayHealth());
                System.out.print("Enter choice: ");
                choice = input.nextInt();
            }


        } while (!isWinning);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
    // Quest 2 - complete
    private static void findSqrt(double number, int choice) {

        boolean isWinning = false;

        do {
            if (choice < 1 || choice > 2) {
                System.out.println("Invalid Input!");
                continue;
            }

            int root = (int) Math.sqrt(number);
            boolean isPerfectSquare = ((Math.pow(root,2)) == number);

            if ((isPerfectSquare && choice == 1) || !isPerfectSquare && choice == 2) {
                System.out.println(displayHealth() + "\nYes, that's correct!");
                isWinning = true;
            } else {
                System.out.println("Wrong!");
                takeDamage();
                System.out.println(displayHealth());
            }

            if (!isWinning) {
                System.out.println("\nFind out if the number " + randomNumbers + "\nis a [ 1 ] Perfect square or [ 2 ] Not a Perfect Square\n");
                System.out.println(displayHealth());
                System.out.print("Enter choice: ");
                choice = input.nextInt();
            }


        } while (!isWinning);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


    // Quest 3 - complete
    private static double f(double x) {
        return 3 * Math.pow(x, 3) - 5 * Math.pow(x, 2) + 39 * Math.pow(x, 1) + 2;

    }

    public static int getIntDerivative(double x) {
        double h = 0.00001;

        double decimalDerivative = (f(x + h) - f(x - h)) / (2 * h);

        return (int) Math.round(decimalDerivative);
    }

    public static void printDerivative(int answer) {

        boolean isWinning = false;

        do {
            double pointX = 4.0;
            int slope = getIntDerivative(pointX);
            if (answer != getIntDerivative(pointX)) {
                System.out.println("Wrong answer!");
                takeDamage();
                System.out.println(displayHealth());
            } else {
                System.out.println("Correct! The integer derivative at x=4 is: " + slope);
                isWinning = true;
            }

            if (!isWinning) {
                System.out.println("\nFind out the derivative of \\(f(x) = 3x^3 - 5x^2 + 39x + 2\\)"
                        + "\nif x = 4\n");
                System.out.print("Enter your answer: ");
                answer = input.nextInt();
            }


        } while (!isWinning);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static int getRandomNumber(int max, int min) {
        return (int) Math.floor(Math.random() * max) + min;
    }

    // Quest 4 - complete
    public static void guessingQuest() {
        int guess;
        int secretNumber = getRandomNumber(100, 1);
        String clue = (secretNumber > 90) ? "The clue: Number is between 91 & 100"
                : (secretNumber > 80) ? "The clue: Number is between 81 & 90"
                : (secretNumber > 70) ? "The clue: Number is between 71 & 80"
                : (secretNumber > 60) ? "The clue: Number is between 61 & 70"
                : (secretNumber > 50) ? "The clue: Number is between 51 & 60"
                : (secretNumber > 40) ? "The clue: Number is between 41 & 50"
                : (secretNumber > 30) ? "The clue: Number is between 31 & 40"
                : (secretNumber > 20) ? "The clue: Number is between 21 & 30"
                : (secretNumber > 10) ? "The clue: Number is between 11 & 20"
                : (secretNumber > 0) ? "The clue: Number is between 1 & 10" : "The clue: Number is a positive integer!";

        do {
            System.out.println(clue);

            System.out.print("Enter your answer: ");
            guess = input.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input!");
                continue;
            }

            if (guess > secretNumber) {
                System.out.println("Too high!");
                takeDamage();
                System.out.println(displayHealth());
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
                takeDamage();
                System.out.println(displayHealth());
            }

        } while (guess != secretNumber);

        System.out.println("Correct!");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    // Quest 5 - complete
    private static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void findTheArea(double area) {
        double radius = 7;
        double correctAnswer = circleArea(radius);

        while (true) {
            if (Math.abs(area - correctAnswer) < 0.01) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong");
                takeDamage();
                System.out.println(displayHealth());
                System.out.print("Enter the area: ");
                area = input.nextDouble();
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    // Quest 6 - complete
    public static void guessTheWord() {
        String secretWord = "Yeshua", secretHigher = secretWord.toLowerCase(), guess;


        do {
            System.out.print("Enter your guess: ");
            guess = input.nextLine().trim().toLowerCase();

            if (getWordLength(guess) != getWordLength(secretWord)) {
                System.out.println("The word must have " + getWordLength(secretWord) + " letters!");
                continue;
            }

            StringBuilder hint = new StringBuilder();

            for (int i = 0; i < getWordLength(secretWord); i++) {
                if (guess.charAt(i) == secretHigher.charAt(i)) {
                    hint.append(secretWord.charAt(i));
                } else {
                    hint.append("_ ");
                }
            }

            if (guess.equalsIgnoreCase(secretWord)) {
                System.out.println("Correct! The word is " + secretWord + "!");
            } else {
                System.out.println("Hint: " + hint);
                takeDamage();
                System.out.println(displayHealth());
            }

        } while (!guess.equalsIgnoreCase(secretWord));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int getWordLength(String word) {
        return word.length();
    }

    public static void takeDamage() {
        baseHealth--;

        if (baseHealth <= 0) {
            System.out.println("💀 Game Over!");
            System.exit(0);
        }
    }

    public static String displayHealth() {
        return "❤️ Health: " + baseHealth + "/" + maxHealth;
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
