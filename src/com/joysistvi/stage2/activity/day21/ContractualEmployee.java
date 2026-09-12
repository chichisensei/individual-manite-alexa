package com.joysistvi.stage2.activity.day21;

public class ContractualEmployee extends Employee {

    private final int hoursWorked;

    public ContractualEmployee(String name, int hoursWorked, int hourlyRate) {
        super(name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computeSalary() {
        return hoursWorked * super.computeSalary();
    }

    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }
}
