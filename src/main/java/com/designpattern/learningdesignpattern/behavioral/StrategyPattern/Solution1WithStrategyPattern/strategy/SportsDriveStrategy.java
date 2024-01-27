package com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }

}
