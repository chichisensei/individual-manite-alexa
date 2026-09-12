package com.joysistvi.stage2.discussion.day20;

public class CreditCardPayment extends Payment{

    double cashAdvance;

    public CreditCardPayment (double balance) {
        super(balance);
    }

    @Override
    void toPay(double amount) {
        System.out.println("Paid  " + amount + " using credit card");
    }
}
