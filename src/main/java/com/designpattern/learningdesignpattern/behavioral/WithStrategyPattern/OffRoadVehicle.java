package com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern;

import com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

}
