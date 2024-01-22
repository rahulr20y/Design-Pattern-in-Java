package com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observable;

import com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStock(int newStockAdded);

    public int getStockCount();
}
