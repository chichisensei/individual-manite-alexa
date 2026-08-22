package com.joysistvi.stage1.day3;

import java.util.Scanner;

public class Activity_Manite {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //String
        System.out.print("Enter your name: ");
        String greet = "Have a blessed day";
        String message = "God loves you!";
        String name = scanner.nextLine();

        //printString
        System.out.print("Hi, " + name + "!" + " " + greet + "!");
        System.out.println(" " + message + "\n");


        //char
        System.out.print("Enter your favorite letter: ");
        String mine = "Mine is letter";
        char letter = 'L';
        char letterFromUser = scanner.next().charAt(0);

        //printChar
        System.out.print("User: " + letterFromUser);
        System.out.println("\n" + "Chichi: " + mine + " " + letter + "." + "\n");

        //boolean
        System.out.print("Are you handsome/beautiful? (true/false): ");
        boolean isUserAnswer = scanner.nextBoolean();
        boolean bolahin = true;

        //printBoolean
        System.out.print("User: " + isUserAnswer + "\n");
        if (isUserAnswer) {
            System.out.println("Chichi: " + "Magkakaroon ka ng long-time partner" + "\n");
        } else {
            System.out.println("Chichi: " + bolahin + " " + "eh!" + " " + "Niloloko mo ako eh!" + "\n");
        }

        //byte
        System.out.print("Enter your Age: ");
        byte ageOfUser = scanner.nextByte();
        byte ageOfChichi = 27;
        String ageMessage = "You look younger for a";

        //printByte
        System.out.print("User: " + ageOfUser + " " + "years old" + "." + "\n");
        System.out.println("Chichi: " + ageMessage + " " + ageOfUser + " " + "year old. I am already " + ageOfChichi + " " + "years old" + "." + "\n");

        //long
        System.out.print("Wanna know my password? (true/false): ");
        boolean isUserDecision = scanner.nextBoolean();
        long passOfChichi = 123456789;

        //printLong
        System.out.print("User: " + isUserDecision + "\n");
        if (isUserDecision) {
            System.out.println("Chichi: " + "My password is " + passOfChichi + "." + "\n");
        } else {
            System.out.println("Chichi: " + "Still going to give you my password. Here it is: " + passOfChichi + "." + "\n");
        }


        //short
        System.out.print("What is your favorite number? ");
        short shortUser = scanner.nextShort();
        short shortChichi = 1;

        //printShort
        System.out.print("User: " + shortUser + "\n");
        System.out.println("Chichi: " + "Mine is number " + "1" + "," + " " + "because you're number 1!" + "\n");

        //int
        System.out.print("How many reps in pull-ups you can do? ");
        int repsUser = scanner.nextInt();
        String repsChichiMessage = "You can do better! Try to do";
        int repsChichi = 100;

        //printInt
        System.out.print("User: " + repsUser + " " + "reps\n");
        System.out.println("Chichi: " + repsChichiMessage + " " + repsChichi + "." + "\n");


        //double
        System.out.print("Enter some decimal numbers: ");
        double decimalUser = scanner.nextDouble();
        String decimalChichiMessage = "Okay, the division of " + decimalUser + " is already yours, but mine is";
        double decimalChichi = 9.9999999999d;

        //printDouble
        System.out.println("User: " + decimalUser);
        System.out.print("Chichi: " + decimalChichiMessage + " " + decimalChichi + ".\n" + "\n");

        //float
        System.out.print("How much is the one you need? ");
        float floatUser = scanner.nextFloat();
        String floatChichiMessage =  "That " + floatUser + " " + "thing is so expensive! I only have";
        float floatChichi = 150.50F;

        //printFloat
        System.out.println("User: " + floatUser);
        System.out.print("Chichi: " + floatChichiMessage + " " + floatChichi + " " + "yen" + "." + "\n");



        scanner.close();
    }
}
