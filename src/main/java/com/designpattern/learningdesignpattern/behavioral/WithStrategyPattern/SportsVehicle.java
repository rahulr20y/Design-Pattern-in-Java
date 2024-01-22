package com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern;

import com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

}
