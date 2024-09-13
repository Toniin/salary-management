package com.salarymanagement.entity;

public class Invoice {
    private String date;
    private int price;
    private String label;

    public Invoice(String date, int price, String label) {
        this.date = date;
        this.price = price;
        this.label = label;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
