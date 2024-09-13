package com.salarymanagement;

public class Representant extends Employe{
    public Representant(String lastName, String firstName, int age, String entryDate, int salary) {
        super(lastName, firstName, age, entryDate, salary);

        int RepresentantSalary = (int)(super.getSalary() * 0.2) + 800;

        super.setSalary(RepresentantSalary);
    }
}
