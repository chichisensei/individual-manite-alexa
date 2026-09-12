package com.joysistvi.stage2.activity.day21;

public class Employee {
    protected String name;
    protected double baseSalary;
    protected String employeeType;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public double computeSalary() {
        return baseSalary;
    }

    public float computeSalary(float tax) {
        return (float) computeSalary() * tax;
    }

    public double computeSalary(double taxRate) {
        double totalSalary = computeSalary();
        double tax = totalSalary * taxRate;
        return totalSalary - tax;
    }



    public String storeData() {
        return String.format("""
                Name: %s
                Employee Type: %s
                Base Salary: PHP %.2f
                Total Salary: PHP %.2f
                Tax (10%%): PHP %.2f
                """,
                getName(),
                getEmployeeType(),
                getBaseSalary(),
                computeSalary(),
                computeSalary(0.10f)
        );

    }

    public String storeData(double taxRate) {
        return String.format("""
                Net Pay: PHP %.2f
                """,
                computeSalary(taxRate)
                );
    }




}
