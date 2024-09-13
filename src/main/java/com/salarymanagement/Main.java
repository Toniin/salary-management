package com.salarymanagement;

import com.salarymanagement.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Staff myEmployees = new Staff();

        myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
        myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
        myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
        myEmployees.add(new Wharehouseman("Jeanne", "Stocktout", 32, "1998", 45));
        myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
        myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));

        List<Invoice> paulInvoices = new ArrayList<Invoice>();
        Invoice paulInvoice1 = new Invoice("2001", 50, "label");
        Invoice paulInvoice2 = new Invoice("2002", 500, "label");
        Invoice paulInvoice3 = new Invoice("2003", 500, "Frais de déplacement");

        paulInvoices.add(paulInvoice1);
        paulInvoices.add(paulInvoice2);
        paulInvoices.add(paulInvoice3);

        myEmployees.add(new Independent("Nat", "Han", 12345, paulInvoices));

        System.out.println("Liste des salaires des employés :");
        myEmployees.displaySalaries();

        System.out.print("Valeur du salaire moyen : ");
        myEmployees.displayAverageSalary();
    }
}