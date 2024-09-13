package com.salarymanagement.entity;

public class Wharehouseman extends Employe {
    private int salary;

    public Wharehouseman(String lastName, String firstName, int age, String entryDate, int hours) {
        super(lastName, firstName, age, entryDate);

        this.salary = hours * 65;
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
