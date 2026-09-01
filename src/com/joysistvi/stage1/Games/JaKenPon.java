package com.joysistvi.stage1.Games;


import java.util.Random;
import java.util.Scanner;

public class JaKenPon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] comp = {"rock", "paper", "scissor"};
        int player;
        boolean is_winning = false;

        System.out.println("=== Welcome to JaKenPon Game ===");

        while (!is_winning) {
            // choices
            System.out.println("1 - rock, 2 - paper, 3 - scissor");
            player = input.nextInt();




        }
    }
}
