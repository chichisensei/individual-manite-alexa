package com.joysistvi.stage2.discussion.day20;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class GcashPayment extends Payment{

    double savings;

    public GcashPayment (double balance) {
        super(balance);

    }
    // Polymorphism: method overriding
    @Override
    void toPay(double amount) {

        System.out.println("Paid  " + amount + " using gcash");


    }
}
