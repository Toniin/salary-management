package com.salarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private final List<Employe> listEmployees = new ArrayList<Employe>();
    private int SalarySum;

    public void add(Employe employe) {
        listEmployees.add(employe);
    }

    public void displaySalaries() {
        for (Employe employee : listEmployees) {
            System.out.println("L'employé " + employee.getLastName() + " " + employee.getFirstName() + " a un salaire de " + employee.getSalary() + " €");
        }
    }

    public void displayAverageSalary() {
        for (Employe employee : listEmployees) {
            this.SalarySum = this.SalarySum + employee.getSalary();
        }
        System.out.println(this.SalarySum / listEmployees.size() + " €");
    }
}
