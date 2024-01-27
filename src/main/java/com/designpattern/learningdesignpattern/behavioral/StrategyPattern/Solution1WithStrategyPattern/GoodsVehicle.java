package com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern;

import com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
