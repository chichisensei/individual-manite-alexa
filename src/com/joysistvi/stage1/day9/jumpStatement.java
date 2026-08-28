package com.joysistvi.stage1.day9;

public class jumpStatement {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 6) {
                continue;
            }


            System.out.println(i);
        }
    }
}
