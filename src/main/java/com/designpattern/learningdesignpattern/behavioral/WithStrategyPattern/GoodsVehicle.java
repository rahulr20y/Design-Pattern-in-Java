package com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern;

import com.designpattern.learningdesignpattern.behavioral.WithStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
