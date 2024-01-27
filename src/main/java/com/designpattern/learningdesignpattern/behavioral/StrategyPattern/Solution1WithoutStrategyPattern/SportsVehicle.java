package com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithoutStrategyPattern;

public class SportsVehicle extends Vehicle {
    // different drive logic
    @Override
    public void drive() {
        System.out.println("Sports Dive Capabilty");
    }
}
