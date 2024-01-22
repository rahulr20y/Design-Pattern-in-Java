package com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observer;

import com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    private String userName;
    private StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product is in stock:" + observable.getStockCount());
    }

    private void sendMessageOnMobile(String userName, String msg) {
        System.out.println("Message sent to " + userName + " with message: " + msg);
    }

}
