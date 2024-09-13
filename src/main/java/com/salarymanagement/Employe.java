package com.salarymanagement;

public class Employe {
    private String lastName;
    private String firstName;
    private int age;
    private String entryDate;
    private int salary;

    public Employe(String lastName, String firstName, int age, String entryDate, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.entryDate = entryDate;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
