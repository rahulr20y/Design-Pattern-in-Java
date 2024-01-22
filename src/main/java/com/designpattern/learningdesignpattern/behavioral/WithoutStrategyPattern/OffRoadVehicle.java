package com.designpattern.learningdesignpattern.behavioral.WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {
    // different drive logic
    @Override
    public void drive() {
        System.out.println("Sports Dive Capabilty");
    }
}
