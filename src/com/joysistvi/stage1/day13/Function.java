package com.joysistvi.stage1.day13;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter first number: ");
        int secondNum = input.nextInt();
        System.out.println(sum(firstNum, secondNum));
    }

    // parameters and arguments
    public static int sum(int a, int b) {


        return a + b;
    }
}
