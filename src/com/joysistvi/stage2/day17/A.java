package com.joysistvi.stage2.day17;

// Access Modifier
public class A {

    public String name;

    private int age;

    private void printAge(){}

    private String address;

    protected void printAddress() {}

    String color; // default access modifier -> package private

    public static void main(String[] args) {
        A a = new A();



        System.out.println(a.age);
    }

    public void printName() {}
}
