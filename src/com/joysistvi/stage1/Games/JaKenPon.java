package com.joysistvi.stage1.Games;


import java.util.Random;
import java.util.Scanner;

public class JaKenPon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] comp = {1, 2, 3};
        int index = (int) Math.floor(Math.random() * comp.length);
        int compChoice = comp[index];



        int player;
        boolean is_winning = false;

        System.out.println("=== Welcome to JaKenPon Game ===");

        while (!is_winning) {
            // choices
            System.out.print("1 - rock, 2 - paper, 3 - scissor ");
            player = input.nextInt();



            System.out.printf("Computer chose %d",compChoice);

            if (player == compChoice) {
                System.out.println("Draw!");
            } else if (player == 1 && compChoice != 2 || player == 2 && compChoice != 3 || player == 3 && compChoice != 1) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }





            System.out.print("Play again? [1] - Yes | [2] - No ? ");
            int choice = input.nextInt();

            if (choice != 1) {
                is_winning = true;
            }




        }

        input.close();
    }
}
