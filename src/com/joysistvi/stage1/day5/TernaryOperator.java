package com.joysistvi.stage1.day5;

public class TernaryOperator {

    public static void main(String[] args) {
        // syntax
        // (condition) ? true block : false block;

        // Program that identifies if the number is positive or negative
        int num = -10;

        String numberType = (num > 0) ? "Positive" : "Negative";
        System.out.printf(numberType + " Number\n");

        // Program that identifies if the number is odd or even
        int num2 = 100;
        boolean isEven = num2 % 2 == 0 ? true : false;
        System.out.println(isEven + "\n");

        int num3 = 201;
        String numberCategory = num3 % 2 == 0 ? "Even" : "Odd";
        System.out.println(numberCategory + " Number");

    }
}
