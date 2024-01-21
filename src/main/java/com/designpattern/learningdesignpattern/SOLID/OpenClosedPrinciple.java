package com.designpattern.learningdesignpattern.SOLID;

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        System.out.println("Open for extension but closed for modification");
    }
}

// problem statement
class PInvoiceDao {
    private Invoice invoice;

    public PInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // save the data to Database
    }

}

// now suppose we want it to save in a file then we have to modify existing
class PInvoiceDaoFile {
    private Invoice invoice;

    public PInvoiceDaoFile(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // save the data to Database
    }

    public void saveToFile() {
        // save the data to File
    }
}

// Solution
interface InvoiceDao {
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        // save to DB
    }

}

class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // save to File
    }
}
