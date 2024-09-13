package com.salarymanagement.entity;

import java.util.List;

public class Independent extends Person {
    private int nbSIREN;
    private List<Invoice> invoices;
    private int salary;
    private int InvoicesSum;

    public Independent(String lastName, String firstName, int nbSIREN, List<Invoice> invoices) {
        super(lastName, firstName);
        this.nbSIREN = nbSIREN;
        this.invoices = invoices;

        for (Invoice invoice : this.invoices) {
            if (invoice.getLabel() != "Frais de déplacement") {
                this.InvoicesSum += invoice.getPrice();
            }
        }
        this.salary = this.InvoicesSum;
    }

    public int getNbSIREN() {
        return nbSIREN;
    }

    public void setNbSIREN(int nbSIREN) {
        this.nbSIREN = nbSIREN;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
