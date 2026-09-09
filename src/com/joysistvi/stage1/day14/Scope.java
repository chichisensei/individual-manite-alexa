package com.joysistvi.stage1.day14;

public class Scope {

    public static void main(String[] args) {
        System.out.println(name);
        printName();

        Scope scope = new Scope();
        System.out.println(scope.age);
        scope.printAge();

        int x = 10; // local variable
        System.out.println(x);


        // loops, switch, trycatch
        // block scope variable
        if (true) {
            double balance = 100.0; // block scope variable
        }

        //System.out.println(balance); // it will become error because balance is a block scope variable
    }

    static String name = "Chichi"; // static variable

    public static void printName() {// static method
        System.out.println(name);
    }

    int age = 27; // instance variable

    public void printAge() { //instance method
        System.out.println(age);
    }


}

/*     A        B        Result
    static to static    direct
    static to instance    direct
    instance to static    instantiate
    instance to instance    direct
 */
