package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.factory;

import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.Maruti;
import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.Swift;
import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.Vehicle;

public class OrdinaryVehicleFactory extends VehicleAbstractFactory {

    @Override
    public Vehicle getVehicle(String input) {
        switch (input) {
            case "Swift":
                return new Swift();
            case "Maruti":
                return new Maruti();
            default:
                return null;
        }
    }

}
