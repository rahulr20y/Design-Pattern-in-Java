package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.factory;

import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.Vehicle;

public abstract class VehicleAbstractFactory {
    public abstract Vehicle getVehicle(String input);
}
