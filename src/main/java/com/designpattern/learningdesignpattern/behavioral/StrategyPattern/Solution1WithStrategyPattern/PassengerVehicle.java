package com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern;

import com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
