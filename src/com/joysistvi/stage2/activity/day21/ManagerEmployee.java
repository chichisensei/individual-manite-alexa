package com.joysistvi.stage2.activity.day21;

public class ManagerEmployee extends Employee{
    private final double allowance = 5000;

    public ManagerEmployee (String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + allowance;
    }

    @Override
    public String getEmployeeType() {
        return "Manager";
    }
}
