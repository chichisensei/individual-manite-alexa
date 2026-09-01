package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // [Section] Declaration Syntax of a multi-dimensional array

        // dataType[][] arrayName = { {}. {}, {} };

        int[][] numbers = {
             // 0   1  2 col
                {1, 2, 3}, // 0 index row
                {4, 5, 6}, // 1 index
                {7, 8, 9},
                {10, 11, 12}// 2 index
        };

        // [Get the length]
       // System.out.println(numbers.length);
        //System.out.println(numbers.length);
        //System.out.println(numbers[0].length);

        // [Section] Invoke an element
        //                     [row][col]
       // System.out.print(numbers[0][1]);

        // [Section] Nested For Loop -> traversing a multi-dimensional array
        for (int i = 0; i < numbers.length; i++) { // outerloop (i -> rows)
            for (int j = 0; j < numbers[i].length; j++) { // innerloop (i -> columns)
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // new line
        }

        System.out.println();

        // [Section] Enhanced Nested For loop / For Each Loop
        for (int[] rows : numbers) { //{1,2,3}
            for (int columns : rows) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }

        System.out.println();


        // [Section] Syntax -> Multi-dimensional array with a specified size only
        // dataType[][] arrayObject = new dataType[rows][columns]

 //       String[][] planets = new String[2][4];
//        planets[0][0] = "Mercury";
//        planets[0][1] = "Venus";
//        planets[0][2] = "Earth";
//        planets[0][3] = "Mars";
//
//        planets[1][0] = "Jupiter";
//        planets[1][1] = "Saturn";
//        planets[1][2] = "Uranus";
//        planets[1][3] = "Neptune";
        // Jupiter, Saturn, Uranus, Neptune
        Scanner scanner = new Scanner(System.in);
        // [Section] Syntax -> Multi-dimensional array using Scanner
        String[][] planets = new String[2][4];

        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.print("Enter planet: [" + i + "][" + j + "]: ");
                planets[i][j] = scanner.nextLine();
            }
        }

        for (String[] rows : planets) {
            for (String columns : rows) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }

    }
}
