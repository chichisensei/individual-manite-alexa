package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNum = input.nextDouble();
        input.nextLine();

        System.out.println("Enter operator (+, -, *, /): ");
        char operator = input.nextLine().charAt(0);

        System.out.println("Enter second number: ");
        double secondNum = input.nextDouble();



        switch(operator) {
            case '+':
                System.out.println("Result: " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println("Result: " + (firstNum - secondNum));
                break;
            case '*':
                System.out.println("Result: " + (firstNum * secondNum));
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("Undefined");
                } else {
                    System.out.println("Result: " + (firstNum / secondNum));
                }
                break;
            default:
                System.out.println("Invalid Operator");

        }


    }
}
