package com.joysistvi.stage1.day3;

public class VariableThursday {

    public static void main(String[] args) { // main method
        // Initialization
        String timba = "tubig";
        int age = 27;
        String address = "Metro Manila";

        // Multiple variables with similar datatypes

        String progLanguage = "Java", progLanguage2 = "C++", progLanguage3 = "JavaScript", progLanguage4 = "Python";

        //System.out.println(progLanguage);

        // Declaration
        float temp;

        // assign value
        temp = 38.1f;

        System.out.println("Temperature: " + temp);
        System.out.println("Age: " + age);

        // Concatenation -> Joining strings

        // [Section] Mini-Activity
        // Print your fullname
        // Use firstName, middleInitial, and lastName variable
        String firstName = "Alexa Therese", middleInitial = "Q.", lastName = "Manite";
        // Use String data type
        // Expected Output: Ronquillo, Jareth B.
        System.out.println(lastName + "," + " " + firstName + " " + middleInitial);
    }
}
