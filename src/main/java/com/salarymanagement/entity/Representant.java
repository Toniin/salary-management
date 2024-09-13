package com.salarymanagement.entity;

public class Representant extends Employe {
    private int salary;

    public Representant(String lastName, String firstName, int age, String entryDate, int turnover) {
        super(lastName, firstName, age, entryDate);

        this.salary = (int)(turnover * 0.2) + 800;
    }

    public void displaySalary() {
        System.out.println("L'employé " + this.getLastName() + " " + this.getFirstName() + " a un salaire de " + this.salary + " €");
    }

    public int getSalary() {
        return this.salary;
    }
}
