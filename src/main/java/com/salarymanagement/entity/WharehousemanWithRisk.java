package com.salarymanagement.entity;

public class WharehousemanWithRisk extends Wharehouseman {
    public WharehousemanWithRisk(String lastName, String firstName, int age, String entryDate, int salary) {
        super(lastName, firstName, age, entryDate, salary);

        int WharehousemanWithRiskSalary = super.getSalary() + 200;

        super.setSalary(WharehousemanWithRiskSalary);
    }
}
