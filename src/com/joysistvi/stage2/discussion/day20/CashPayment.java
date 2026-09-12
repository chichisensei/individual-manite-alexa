package com.joysistvi.stage2.discussion.day20;

public class CashPayment extends Payment{

    double cashAdvance;

    public CashPayment (double balance) {
        super(balance);
    }

    @Override
    void toPay(double amount) {
        System.out.println("Paid  " + amount + " using cash");
    }
}
