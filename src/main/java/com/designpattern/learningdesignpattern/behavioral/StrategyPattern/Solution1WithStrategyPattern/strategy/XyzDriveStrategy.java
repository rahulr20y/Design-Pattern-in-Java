package com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern.strategy;

public class XyzDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("XYZ Drive Capabilty");
    }

}
