package com.designpattern.learningdesignpattern.SOLID;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        System.out.println("A class Should have only one reason to change");
    }
}

// problem statement
class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

class InvoiceTemp {
    private Marker marker;// has a relationship with marker
    private int quantity;

    public InvoiceTemp(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() { // 1st reason to change
        int price = (marker.price) * quantity;
        return price;
    }

    public void printInvoice() { // 2nd reason to change
        // print the invoice
    }

    public void saveToDB() { // 3rd reason to change
        // save the data to Database
    }

}

// solution
class Invoice {
    private Marker marker;// has a relationship with marker
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() { // first reason to change
        int price = (marker.price) * quantity;
        return price;
    }

}

class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() { // 3rd reason to change
        // save the data to Database
    }
}

class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() { // 2nd reason to change
        // print the invoice
    }

}