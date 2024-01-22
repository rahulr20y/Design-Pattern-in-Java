package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.factory;

import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.BMW;
import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.Mercedes;
import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.Vehicle;

public class LuxuryVehicleFactory extends VehicleAbstractFactory {

    @Override
    public Vehicle getVehicle(String input) {
        switch (input) {
            case "Mercedes":
                return new Mercedes();
            case "BMW":
                return new BMW();
            default:
                return null;
        }
    }

}
