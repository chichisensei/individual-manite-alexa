package com.joysistvi.stage2.discussion.day20;


public class Payment {

    double balance;
    double amount;

    public Payment(double balance) {
        this.balance = balance;

    }

    void toPay(double amount) {

        System.out.println("Processing generic payment of amount " + amount);
    }
}

// public > protected > default > private