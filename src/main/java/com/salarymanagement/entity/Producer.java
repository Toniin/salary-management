package com.salarymanagement.entity;

public class Producer extends Employe {
    private int salary;

    public Producer(String lastName, String firstName, int age, String entryDate, int entitiesSales) {
        super(lastName, firstName, age, entryDate);

        this.salary = entitiesSales * 5;
    }

    public void displaySalary() {
        System.out.println("L'employé " + this.getLastName() + " " + this.getFirstName() + " a un salaire de " + this.salary + " €");
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
