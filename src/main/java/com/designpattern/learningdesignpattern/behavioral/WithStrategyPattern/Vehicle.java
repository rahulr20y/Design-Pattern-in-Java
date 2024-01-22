package com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern;

import com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
