package com.designpattern.learningdesignpattern.behavioral.MediatorPattern.Solution1WithMediatorPattern;

public interface Colleague {
    void placeBid(int bidAmount);

    void receiveNotification(int bidAmount);
    String getName();
}
