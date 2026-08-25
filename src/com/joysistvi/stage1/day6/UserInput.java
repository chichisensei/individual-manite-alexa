package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        // Create an object of Scanner / Instatiation
        // [Syntax] ClassName object = new Constructor(argument)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = input.nextLine();

        System.out.print("Enter your Age: ");
        int age = input.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);


    }
}
