package com.joysistvi.stage2.day17;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Activity12_Manite {

    static Scanner input = new Scanner(System.in);

    // method to print your full name and age OK
    // method to print your name 50 times OK
    // method to print a certain word in reverse order

    // method to identify if a person is a voter or not
    // method to identify if a number is odd or even
    // method to get the square root of a certain variable
    //a method to get the power of a number using base and exponent
    // method to print a random number between 1 & 100
    // a method to get the area of a circle using the given radius
    // method to get the length of a certain word



    //Adventure game?
    // Ask user's info
    // pick user character
    // display coins and health

    public static void main(String[] args) throws InterruptedException {

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        printNameAge(name,age);
        printName50(name);

//        printNameReverse(name);



    }

    public static void printNameAge(String name, int age) {
        System.out.printf("%nName: %s%n" +
                "Age: %d%n", name,age);


    }

    public static void printName50(String name) throws InterruptedException{
        String[][] names = new String[5][10];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++){
                names[i][j] = name;

            }
        }

        StringBuilder output = new StringBuilder();
        for (String[] rows : names) {
            for (String columns : rows) {
                String textPrint = columns + " ";
                output.append(textPrint);
                System.out.print(textPrint);
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

        int totalLength = output.length() + names.length;
        for (int i = 0; i < totalLength; i++) {
            System.out.print("\b \b");
            System.out.flush();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    public static void printNameReverse(String name) {

        if (name == null) return;
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
        System.out.println();

    }

}
