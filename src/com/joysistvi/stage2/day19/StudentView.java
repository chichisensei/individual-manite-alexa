package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class StudentView {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        Student stud = new Student(id, name, 27, "Java Programming", "Section 1", "Tomisato, Chiba");

        System.out.println("Student Profile");
        System.out.println("ID: " + stud.getId());
        System.out.println("Name: " + stud.getName());
        System.out.println("Age: " + stud.getAge());
        System.out.println("Course: " + stud.getCourse());
        System.out.println("Section: " + stud.getSection());
        System.out.println("Address: " + stud.getAddress());
    }
}
