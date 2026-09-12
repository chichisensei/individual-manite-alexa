package com.joysistvi.stage2.activity.day21;

public class RegularEmployee extends Employee {
    private final double attendanceBonus = 1000;

    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);

    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + attendanceBonus;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }
}
