package com.joysistvi.stage1.day13;

public class Main {
    // Create an obj -> instantiation
    // className object = new Constructor();

    // Scanner, String, Math
    public static void main(String[] args) {
        // FUJITSU
        Laptop lappy = new Laptop();
        lappy.brand = "Fujitsu";
        lappy.color = "Black";
        lappy.ramInGb = 8;
        lappy.weightInKg = 1.0;
        lappy.cpu = "i5";

        lappy.playGames();
        lappy.sendEmail();
        lappy.writeCodes();
        lappy.watchTutorial();

        System.out.println(lappy.cpu);
        lappy.playGames();


        Laptop lappy2 = new Laptop();
        lappy2.brand = "Lenovo";
        lappy2.color = "blue";
        lappy2.ramInGb = 8;
        lappy2.weightInKg = 2.0;
        lappy2.cpu = "i3";

        lappy2.playGames();
        lappy2.sendEmail();
        lappy2.writeCodes();
        lappy2.watchTutorial();

        Laptop lappy3 = new Laptop();

        lappy3.brand = "Asus";
        lappy3.color = "white";
        lappy3.ramInGb = 8;
        lappy3.weightInKg = 2.0;
        lappy3.cpu = "i5";

        lappy3.playGames();
        lappy3.sendEmail();
        lappy3.writeCodes();
        lappy3.watchTutorial();
    }







}
