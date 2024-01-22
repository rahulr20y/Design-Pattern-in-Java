package com.designpattern.learningdesignpattern.behavioral.WithoutStrategyPattern;

public class SportsVehicle extends Vehicle {
    // different drive logic
    @Override
    public void drive() {
        System.out.println("Sports Dive Capabilty");
    }
}
