package com.designpattern.learningdesignpattern.structural.FacadePattern.Solution2WithFacadePattern;

class Product {

}

class ProductDao {
    public Product getProduct(int productId) {
        // get product based on product id
        return new Product();
    }
}

class Payment {
    public boolean makePayment() {
        // initiate payment and return true if it is success
        return true;
    }
}

class Invoice {
    public void generateInvoice() {
        // this will generate a invoice
    }
}

class Notification {
    public void sendNotification() {
        // send a notification
    }
}

public class Subsystem {

}
