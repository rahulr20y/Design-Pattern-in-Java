package com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern;

import com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
