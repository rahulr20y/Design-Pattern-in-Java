package com.designpattern.learningdesignpattern.SOLID;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        System.out.println(
                "If Class B is subtype of Class A, then we should be able to replace object of A with B without breaking the behaviour of the program");
        System.out.println("Subclass should extend the capability of Parent class and not narrow it down");

        // client impl
        List<Vehicle> vehiclelist = new ArrayList<>();
        vehiclelist.add(new MotorCycle());
        vehiclelist.add(new Car());
        vehiclelist.add(new Bicycle());
        for (Vehicle vehicle : vehiclelist) {
            System.out.println(vehicle.getNumberOfWheels());
        }
    }
}

// problem statement
interface BikeP {
    void turnOnEngine();

    void accelerate();
}

class MotorCycleP implements BikeP {

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        // turn on the engine
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        // increase the speed
        speed = speed + 10;
    }

}

class BicycleP implements BikeP {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no Engine");
    }

    @Override
    public void accelerate() {
        // increase the speed
    }

}

// solution

class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }
}

class EngineVehicle extends Vehicle {

    public boolean hasEngine() {
        return true;
    }
}

class Bicycle extends Vehicle {

}

class Car extends EngineVehicle {

}

class MotorCycle extends EngineVehicle {

}