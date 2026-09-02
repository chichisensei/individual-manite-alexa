package com.joysistvi.stage1.day12;

import java.util.Scanner;

public class Activity11_Manite {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        String[][] mathMethods = {
                {"Methods", "Description", "Syntax", "Example"},//header
                {"Math.abs()", "returns the absolute (positive) value of a given number, removing any negative sign.", "Math.abs(number);", "Math.abs(-14); -> 14"},//math.abs()
                {"Math.max()", "returns the larger of two numerical values. If both arguments are equal, it returns that same value.", "Math.max(value1, value2);", "Math.max(1,14); -> 14"},//Math.max()
                {"Math.min()", "returns the smaller of two numerical values. If both arguments are equal, it returns that same value.", "Math.min(value1, value2);", "Math.min(1,14); -> 1"},//Math.min()
                {"Math.pow()", "returns the value of the first argument raised to the power of the second argument.", "Math.pow(base, exponent);", "Math.pow(12,2); -> 144"},//Math.pow()
                {"Math.sqrt()", "returns the correctly rounded positive square root of a double value.", "Math.sqrt(number);", "Math.sqrt(25); -> 5"},//Math.sqrt()
                {"Math.round()", "returns the closest integer to the specified argument, rounding half-up.", "Math.round(floatValue); |  Math.round(doubleValue);", "Math.round(5.4f); -> 5 | Math.round(5.6); -> 6L"},//Math.round()
                {"Math.ceil()", "returns the smallest double value that is greater than or equal to the argument, rounding up to the nearest mathematical integer.", "Math.ceil(number);", "Math.ceil(5.1); -> 6.0"},//Math.ceil()
                {"Math.floor()", "returns the largest double value that is less than or equal to the argument, rounding down to the nearest mathematical integer.", "Math.floor(number);", "Math.floor(5.9); -> 5"},//Math.floor()
                {"Math.random()", "returns a pseudorandom double value that is greater than or equal to 0.0 and less than 1.0", "Math.random();", "Math.random() * (10 + 1);"},//Math.random()
                {"Math.log()", "returns the natural logarithm (base e) of a given double value", "Math.log(number);", "Math.log(2.71828); -> 1 | Math.log(10); -> ~2.3025"},// Math.log()
                {"Math.log10()", "returns the base 10 algorithm of a given double value.", "Math.log10(number);", "Math.log10(100.0); -> 2.0"},//Math.log10()
                {"Math.exp()", "returns Euler's number e (approximately 2.71828) raised to the power of a specified double value.", "Math.exp(exponent);", "Math.exp(1.0); -> ~2.7182818284459045"},//Math.exp()
                {"Math.sin()", "returns the trigonometric sine of an angle given in radians.", "Math.sin(angleInRadians);", "Math.sin(radians);"},//Math.sin()
                {"Math.cos()", "returns the trigonometric cosine of an angle given in radians", "Math.cos(angleInRadians);", "Math.cos(radians);"},//Math.cos()
                {"Math.tan()", "returns the trigonometric tangent of an angle given in radians.", "Math.tan(angleInRadians);", "Math.tan(radians);"}//Math.tan()

        };

        int numColumns = mathMethods[0].length;
        int[] widthColumns = new int[numColumns];

        // find the maximum width for each column
        for (int col = 0; col < numColumns; col++) {
            int max = 0;
            for (int row = 0; row < mathMethods.length; row++) {
                String[] lines = mathMethods[row][col].split("\n");
                for (String line : lines) {
                    if (line.length() > max) {
                        max = line.length();
                    }
                }
            }

            widthColumns[col] = max;

        }

        // build the border format
        StringBuilder formatBuilder = new StringBuilder("|");
        StringBuilder dividerBuilder = new StringBuilder("+");

        for (int w : widthColumns) {
            formatBuilder.append(" %-").append(w).append("s |");
            dividerBuilder.append("-".repeat(w + 2)).append("+");
        }
        formatBuilder.append("\n");

        // after building format
        String formatSpecifier = formatBuilder.toString(); // going to use to print the table
        String divider = dividerBuilder.toString(); // going to use to print the table

        //print the table
        System.out.println(divider);
        for (int row = 0; row < mathMethods.length; row++) {
            // printMultiLineRow
            System.out.format(formatSpecifier, (Object[]) mathMethods[row]);

            if (row == 0 || row == mathMethods.length - 1) {
                System.out.println(divider);
            }
        }

        System.out.print("Let's play a game? [Yes] | [No] ");
        char choice = Character.toLowerCase(Character.toUpperCase(input.nextLine().charAt(0)));



        if (choice != 'y') {
            System.out.println("Exiting the program...");
            System.exit(0);
        } else {
            System.out.println("Okay, let's go!\n");

        }


        while (choice == 'y') {
            String[] symbols = {"🤖", "🐼", "🙊", "🙈", "❤️"};

            System.out.println("===== SLOT MACHINE =====");
            System.out.print("[1] - Spin? [2] - Exit? ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid Input! Please select an integer from the choices above!");
                input.next();
                System.out.print("[1] - Spin? [2] - Exit? ");
            }
            int choice2 = input.nextInt();

            if (choice2 != 1) {
                break;
            }

            String reel1 = "";
            String reel2 = "";
            String reel3 = "";

            for (int i = 0; i < 30; i++) {
                int index1 = (int) Math.floor(Math.random() * symbols.length);
                int index2 = (int) Math.floor(Math.random() * symbols.length);
                int index3 = (int) Math.floor(Math.random() * symbols.length);

                reel1 = symbols[index1];
                reel2 = symbols[index2];
                reel3 = symbols[index3];

                System.out.print("\r[" + reel1 + "] [" + reel2 + "] [" + reel3 + "]");
                Thread.sleep(100);


            }
            System.out.println("\n------------------------");

            if (reel1.equals(reel2) && reel1.equals(reel3)) {
                System.out.println("🎊🎉JACKPOT! YOU WIN!🎊🎉");
            } else {
                System.out.println("YOU LOSE!😭");
            }

            System.out.print("PLAY AGAIN? [1] - YES | [2] - NO ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid Input! Please select an integer from the choices above!");
                input.next();
                System.out.print("PLAY AGAIN? [1] - YES | [2] - NO ? ");
            }
            int choice3 = input.nextInt();

            if (choice3 != 1) {
                System.exit(0);
            }


        }



        input.close();





    }
}
