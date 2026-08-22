package com.joysistvi.stage1.day4;

public class Activity2_Manite {

    public static void main(String[] args) {
        //Income
        double income = 50000d;
        //Expense
        double foodAllowance = 15000d;
        double transportation = 2500d;
        double rent = 4500d;
        double utilityBill = 3500d;
        //Calculate the percentage
        double foodAllowancePercentage = (foodAllowance / income) * 100;
        double transportationPercentage = (transportation / income) * 100;
        double rentPercentage = (rent / income) * 100;
        double utilityBillPercentage = (utilityBill / income) * 100;
        //Calculate remaining balance
        int balance = (int) (income - (foodAllowance + transportation + rent + utilityBill));
        //Print the results in percentages using printf and the remaining balance as well
        System.out.println("Income: " + (int) income);
        System.out.printf("Food Allowance: %.1f%%%n",foodAllowancePercentage);
        System.out.printf("Transportation: %.1f%%%n",transportationPercentage );
        System.out.printf("Rent: %.1f%%%n",rentPercentage);
        System.out.printf("Utility Bill: %.1f%%%n",utilityBillPercentage);
        System.out.println("Remaining Balance: " + balance);


    }
}
