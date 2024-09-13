package com.salarymanagement.entity;

public class Salesman extends Employe {
    private int salary;

    public Salesman(String lastName, String firstName, int age, String entryDate, int turnover) {
        super(lastName, firstName, age, entryDate);
        this.salary = (int)(turnover * 0.2) + 400;
    }

    public void displaySalary() {
        System.out.println("L'employé " + this.getLastName() + " " + this.getFirstName() + " a un salaire de " + this.salary + " €");
    }

    public int getSalary() {
        return this.salary;
    }
}
