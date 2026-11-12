package com.designpattern.learningdesignpattern.behavioral.StrategyPattern.Solution1WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        /*
         * When feature is not present in base class but few of childe class have
         * duplicate code and following a pattern
         * Strategy pattern can be used.
         */
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        Vehicle vehicle2 = new GoodsVehicle();
        vehicle2.drive();
    }
}
