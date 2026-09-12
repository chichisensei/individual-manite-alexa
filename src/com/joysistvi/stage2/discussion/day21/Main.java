package com.joysistvi.stage2.discussion.day21;

import com.joysistvi.stage2.discussion.day21.Student;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student(123, "Chichi", 27, "Java Programming", "Narra", "Tomisato, Chiba");
        students[1] = new Student(2, "Chisato", 27, "Java Programming");
        students[2] = new Student(1, "Autumn", 26, "Java Programming", "Manila");



        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println();
        }

    }
}
