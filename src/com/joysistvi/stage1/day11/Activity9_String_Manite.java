package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_String_Manite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] dataMethods = {
                {"Method                  ", "Description                                                                                                    ", "Syntax                                                            ", "Example                                             "},
                {"contains()              ", "Checks if the string contains a specific sequence of characters and returns a boolean value.                   ", "boolean contains(Object element)                                  ", "\"Hello\".contains(\"el\") -> true                      "}, //contains()
                {"endsWith()              ", "Tests if the string ends with the specified suffix.                                                            ", "public boolean endsWith(String suffix)                            ", "\"file.pdf\".endsWith(\".pdf\") -> true                 "}, //endsWith()
                {"startsWith()            ", "Tests if the string starts with the specified prefix.                                                          ", "public boolean startsWith(String prefix)                          ", "\"Dr.Smith\".startsWith(\"Dr.\") -> true                "},//startsWith()
                {"indexOf()               ", "Returns the index of the first occurrence of a character or substring, or -1 if not found.                     ", "int indexOf(String str)                                           ", "\"Java\".indexOf(\"v\") -> true                         "},//indexOf()
                {"isEmpty()               ", "Checks if the string length is 0.                                                                              ", "boolean isEmpty()                                                 ", "\"\".isEmpty() -> true                                "},//isEmpty()
                {"trim()                  ", "Removes leading and trailing whitespace.                                                                       ", "String trim()                                                     ", "\" hi \".trim() -> \"hi\"                               "},//trim()
                {"replace()               ", "Replaces all occurrences of a target sequence with a replacement sequence.                                     ", "String replace(CharSequence target, CharSequence replacement)     ", "\"cat\".replace(\"c\", \"b\") -> \"bat\"                    "},//replace()
                {"toCharArray()           ", "Converts the string into new array of characters.                                                              ", "char[] toCharArray()                                              ", "\"Java\".toCharArray() -> ['J', 'a', 'v', 'a']        "},//toCharArray()
                {"nextLine().charAt()     ", "Reads an entire line of user input via \"Scanner\" and extracts the character at the specified index.            ", "scanner.nextLine().charAt(int index)                              ", "scanner.nextLine().charAt(0) Reads \"Yes\" -> 'Y'     "},//nextLine().charAt()
                {"valueOf()               ", "Static method that converts standard primitives or objects into a \"String\".                                    ", "static String valueOf(primitiveType data)                         ", "String.valueOf(100) -> \"100\"                        "}//valueOf()
        };

        System.out.println("+" + "-".repeat(319) + "+");

        for (int i = 0; i < dataMethods.length; i++) { // -> rows

            System.out.print("| ");
            for (int j = 0; j < dataMethods[i].length; j++) { // -> columns
                System.out.print(dataMethods[i][j] + "| ");
            }
            System.out.println(); // new line
            System.out.println("+" + "-".repeat(319) + "+");
        }

        System.out.println("Proceed to Stretch Goal?");
        System.out.print("[1] - Oui? | [2] - Non?");
        int menuChoice = input.nextInt();
        input.nextLine();


        while (menuChoice == 1) {
            System.out.println("Enter any integers or words: ");
            String user = input.nextLine();

            System.out.println("[1] - Find the first and last character?\n[2] - Count some letters?\n[3] - Count vowels?");
            int choice = input.nextInt();
            input.nextLine();

            while (choice == 1) {
                System.out.print("[1] - First? | [2] - Last?");
                while (!input.hasNextInt()) {
                    System.out.println("Invalid input! Choose an integer!");
                    input.next();
                }
                int choice_two = input.nextInt();
                input.nextLine();

                if (choice_two == 1) {
                    char first = user.charAt(0);
                    System.out.printf("First character: %s",first);
                } else {
                    char last = user.charAt(user.length() - 1);
                    System.out.printf("Last character: %s",last);
                }

                System.out.println("Again? [1] - Oui | [2] - Non");
                while (!input.hasNextInt()) {
                    System.out.println("Invalid input! Choose an integer!");
                    input.next();
                }
                int choice_three = input.nextInt();
                input.nextLine();
                if (choice_three != 1) {
                    break;
                }

            }

            while (choice == 2) {
                char[] charArray = user.toCharArray();
                int countLetter = 0;
                System.out.print("What letters? ");
                char characters = Character.toLowerCase(input.next().charAt(0));
                input.nextLine();
                for (int i = 0; i < charArray.length; i++) {
                    if (Character.toLowerCase(charArray[i]) == characters) {
                        countLetter++;
                    }
                }
                System.out.println("The letter appeared " + countLetter + " times");

                System.out.println("Again? [1] - Oui | [2] - Non");
                while (!input.hasNextInt()) {
                    System.out.println("Invalid input! Choose an integer!");
                    input.next();
                }
                int choice_three = input.nextInt();
                input.nextLine();
                if (choice_three != 1) {
                    break;
                }
            }

            while (choice == 3) {
                int vowelCount = 0;
                String vowels = "aeiou";
                for (int i = 0; i < user.length(); i++) {
                    char cha = Character.toLowerCase(user.charAt(i));
                    if (vowels.indexOf(cha) != -1) {
                        vowelCount++;
                    }
                }
                System.out.println("Total vowels: " + vowelCount);

                System.out.println("Again? [1] - Oui | [2] - Non");
                while (!input.hasNextInt()) {
                    System.out.println("Invalid input! Choose an integer!");
                    input.next();
                }
                int choice_three = input.nextInt();
                input.nextLine();
                if (choice_three != 1) {
                    break;
                }
            }

            System.out.println("\nStay in Stretch Goal menu? [1] - Oui | [2] - Non");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Choose an integer!");
                input.next();
            }
            menuChoice = input.nextInt();
            input.nextLine();


        }
    }
}
