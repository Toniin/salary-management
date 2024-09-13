package com.salarymanagement.entity;

public class ProducerWithRisk extends Producer {
    public ProducerWithRisk(String lastName, String firstName, int age, String entryDate, int salary) {
        super(lastName, firstName, age, entryDate, salary);

        int ProducerWithRiskSalary = super.getSalary() + 200;

        super.setSalary(ProducerWithRiskSalary);
    }
}
