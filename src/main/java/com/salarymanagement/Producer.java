package com.salarymanagement;

public class Producer extends Employe {
    public Producer(String lastName, String firstName, int age, String entryDate, int salary) {
        super(lastName, firstName, age, entryDate, salary);

        int ProducerSalary = super.getSalary() * 5;

        super.setSalary(ProducerSalary);
    }
}
