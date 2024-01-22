package com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capapbility");
    }

}
