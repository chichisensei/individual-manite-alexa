package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class doWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // [Syntax] Do-While Loop
        /*
            initialization; (optional)
            do {
                statement / body of the loop
                increment / decrement (optional)
            } while (condition);
         */

        // Print numbers from 1 - 10
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i >= 10);
    }
}
