package com.salarymanagement;

public class Wharehouseman extends Employe{
    public Wharehouseman(String lastName, String firstName, int age, String entryDate, int salary) {
        super(lastName, firstName, age, entryDate, salary);

        int WharehousemanSalary = super.getSalary() * 65;

        super.setSalary(WharehousemanSalary);
    }
}
