package com.designpattern.learningdesignpattern.structural.FacadePattern.Solution2WithFacadePattern;

public class OrderFacade {
    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    Notification notification;

    public OrderFacade() {
        this.payment = new Payment();
        this.invoice = new Invoice();
        this.notification = new Notification();
        this.productDao = new ProductDao();
    }

    public void createOrder() {
        Product product = productDao.getProduct(55);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
        // order creation successfull
    }
}
