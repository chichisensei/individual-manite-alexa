package com.joysistvi.stage1.day12;

import java.util.Random;
import java.util.Scanner;

public class mathClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Random rand = new Random();
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println( (int) (Math.random() * 58) + 1);
//        }

        // Lotto - Simulator

        // Parsing -> converting a String to primitive datatype or vice versa

        // casting -> number class ex. double to int

//        double decNum = 58.59;
//        int num = (int) decNum;
//        System.out.println(num);

        int roll = (int) (Math.random() * 58) + 1;

        String letter;

        if (roll <= 15) {
            letter = "B";
        } else if (roll <= 30) {
            letter = "I";
        } else if (roll <= 45) {
            letter = "N";
        } else if (roll <= 60) {
            letter = "G";
        } else {
            letter = "O";
        }

        System.out.println("Sa letrang " + letter + " : " + roll);





    }
}
