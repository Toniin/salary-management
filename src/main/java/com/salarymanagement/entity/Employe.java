package com.salarymanagement.entity;

public class Employe extends Person {
    private int age;
    private String entryDate;

    public Employe(String lastName, String firstName, int age, String entryDate) {
        super(lastName, firstName);
        this.age = age;
        this.entryDate = entryDate;
    }

    public int getAge() {
        return age;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
}
