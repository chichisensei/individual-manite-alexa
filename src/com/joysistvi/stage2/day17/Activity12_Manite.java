package com.joysistvi.stage2.day17;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Activity12_Manite {

    static Scanner input = new Scanner(System.in);

    // method to print your full name and age OK
    // method to print your name 50 times OK
    // method to print a certain word in reverse order OK

    // method to identify if a person is a voter or not OK
    // method to identify if a number is odd or even OK! LOOP?
    // method to get the square root of a certain variable OK
    //a method to get the power of a number using base and exponent
    // method to print a random number between 1 & 100
    // a method to get the area of a circle using the given radius
    // method to get the length of a certain word



    //Adventure game?
    // Ask user's info
    // pick user character
    // display coins and health

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int randomIndex = (int) Math.floor(Math.random() * numbers.length);
    static int randomNumbers = (int) Math.floor(Math.random() * 1000) + 1;

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
        startGame();


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

    public static void startGame() {
        String banner = "Welcome to your first quest!\n"
                      + "Find out if the number "
                      + numbers[randomIndex]
                      + "\nis an [ 1 ] odd or [ 2 ] even number",
               banner2 = "\nWelcome to your second quest!\n"
                       + "Find out if the number "
                       + randomNumbers
                       + "\nis a [ 1 ] Perfect square or [ 2 ] Not a Perfect Square";



        System.out.println(banner);

        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        oddOrEven(numbers[randomIndex], choice);

        System.out.println(banner2);
        System.out.print("Enter choice: ");
        choice = input.nextInt();
        findSqrt(randomNumbers, choice);



    }

    private static int oddOrEven(int number, int choice) {
        while (choice < 0 || choice > 2) {
            System.out.println("Invalid Input!");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
        }
        System.out.print((number % 2 == 0 && choice == 2) ? "Yes, correct! It's an even number" : (number % 2 != 0 && choice == 1) ? "Yes, correct! It's an odd number!" : "Wrong! Try Again!");


        return number;

    }

    private static void findSqrt(double number, int choice) {
        while (choice < 0 || choice > 2) {
            System.out.println("Invalid Input!");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
        }

        int root = (int) Math.sqrt(number);
        boolean isPerfectSquare = ((root * root) == number);

        System.out.println(((isPerfectSquare && choice == 1) || !isPerfectSquare && choice == 2) ? "Yes, that's correct!" : "Wrong!" );

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
