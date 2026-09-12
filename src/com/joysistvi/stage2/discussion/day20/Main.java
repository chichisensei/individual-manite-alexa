package com.joysistvi.stage2.discussion.day20;

public class Main {

    public static void main(String[] args) {
        GcashPayment gcash = new GcashPayment(5000);
        CashPayment cash = new CashPayment(5000);
        CreditCardPayment creditCard = new CreditCardPayment(5000);

        gcash.toPay(1500);
        cash.toPay(1500);
        creditCard.toPay(1500);
    }
}
