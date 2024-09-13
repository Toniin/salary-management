package com.salarymanagement;

import com.salarymanagement.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private final List<Person> listPerson = new ArrayList<Person>();
    private int SalarySum;

    public void add(Person person) {
        listPerson.add(person);
    }

    public void displaySalaries() {
        for (Person person : listPerson) {
            person.displaySalary();
        }
    }

    public void displayAverageSalary() {
        for (Person person : listPerson) {
            this.SalarySum = this.SalarySum + person.getSalary();
        }

        System.out.println(this.SalarySum / listPerson.size() + " €");
    }
}