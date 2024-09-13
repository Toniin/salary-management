package com.salarymanagement;

public class Salesman extends Employe {
    public Salesman(String lastName, String firstName, int age, String entryDate, int salary) {
        super(lastName, firstName, age, entryDate, salary);

        int SalesmanSalary = (int)(super.getSalary() * 0.2) + 400;

        super.setSalary(SalesmanSalary);
    }
}
