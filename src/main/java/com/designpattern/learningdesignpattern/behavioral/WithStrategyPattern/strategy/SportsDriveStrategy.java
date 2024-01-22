package com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }

}
