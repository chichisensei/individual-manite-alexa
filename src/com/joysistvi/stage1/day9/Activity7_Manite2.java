package com.joysistvi.stage1.day9;

public class Activity7_Manite2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Multiplication table of %d%n",i);
            for (int j = 0; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " " + "*" + " " + j + " " + "=" + " " + result);
            }
            System.out.println();
        }

    }
}
