package com.designpattern.learningdesignpattern.behavioral.ObserverPattern;

import com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observable.IphoneObservableImpl;
import com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observable.StocksObservable;
import com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.designpattern.learningdesignpattern.behavioral.ObserverPattern.Observer.MobileAlertObserverImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern.............");
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
        iphoneStocksObservable.add(new EmailAlertObserverImpl("rahul@gmail.com", iphoneStocksObservable));
        iphoneStocksObservable.add(new EmailAlertObserverImpl("yadav@gmail.com", iphoneStocksObservable));
        iphoneStocksObservable.add(new MobileAlertObserverImpl("rahulr20y", iphoneStocksObservable));

        iphoneStocksObservable.setStock(0);
        iphoneStocksObservable.setStock(27);

    }
}
