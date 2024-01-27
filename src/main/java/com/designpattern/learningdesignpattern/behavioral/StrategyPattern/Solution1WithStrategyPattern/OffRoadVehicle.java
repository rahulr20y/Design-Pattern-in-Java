package com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern;

import com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

}
