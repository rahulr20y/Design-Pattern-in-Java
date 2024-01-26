package com.designpattern.learningdesignpattern.structural.FlyweightPattern.Solution1WithFlyweightPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        /*
         * Flyweight Pattern:
         * when memory is limited
         * When Objects share data
         * Intrinsic Data: shared amongst object and remain same once defined one value
         * Extrinsic Data: changes based on client input and differs from one object to
         * another
         * Creation on Object is Expensive
         * 
         * Solution:
         * 1. From Object Remove all the Extrinsic data and keep intrinsic data(this is
         * called flyweight Object).
         * 2.This Flyweight can be immutable
         * 3. Extinsic data can be passes to the flyweight class in the method parameter
         * 4. Once the Flyweight Object is created, is is cached and reused whenever
         * required
         * 
         */

        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1, 2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10, 30);

        IRobot roboDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog1.display(2, 9);

        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog2.display(11, 19);

    }
}
