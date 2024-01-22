package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.factory;

import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleAbstractFactory vehicleAbstractFactory, String input) {
        return vehicleAbstractFactory.getVehicle(input);
    }
}
