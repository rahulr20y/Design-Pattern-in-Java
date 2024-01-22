package com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observer;

import com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    private String emailId;
    private StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock hurry up! stocks:" + observable.getStockCount());
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("Mail sent to" + emailId + " with message: " + msg);
    }

}
