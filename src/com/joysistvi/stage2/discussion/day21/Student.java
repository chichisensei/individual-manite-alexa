package com.joysistvi.stage2.discussion.day21;

// Single Responsibility Principle
public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private String section;
    private String address;

    // default constructor
//    public Student() {
//
//    }

    // parametherized constructor
    public Student(int id, String name, int age, String course, String section, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.section = section;
        this.address = address;

    }

    public Student(int id, String name, int age, String course, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
//        this.section = section;
        this.address = address;

    }

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
//        this.section = section;
//        this.address = address;

    }




    // alt + insert

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getSection() {
        return section;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setAddress(String address) {
        //validation
        if (address != null && address.trim().length() >= 5) {
            this.address = address;
        } else {
            this.address = "Unknown"; // fallback value
        }
    }

    public void displayStudentInfo() {
        System.out.println(getName());
        System.out.println(getAddress());
        System.out.println(getAge());
        System.out.println(getCourse());
        System.out.println(getId());
        System.out.println(getSection());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", section='" + section + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //    // getter method / accessor method
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//
//    // setter method / mutator method
//    // this keyword is used to refer immediately to the current object of a class
//    // id
//    public void setId(int id) {
//
//        this.id = id; // assignment to itself
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // Mini-Activity
//
//    //age setter
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    // age getter
//    public int getAge() {
//        return age;
//    }
//
//    // course - setter
//    public void setCourse(String course) {
//        this.course = course;
//    }
//
//    // course - getter
//    public String getCourse() {
//        return course;
//    }
//
//    //  section - setter
//    public void setSection(String section) {
//        this.section = section;
//    }
//    // section - getter
//    public String getSection() {
//        return section;
//    }
//
//    // address - setter
//    public void setAddress(String address) {
//        this.address = address;
//    }
//    // address getter
//    public String getAddress() {
//        return address;
//    }



}

