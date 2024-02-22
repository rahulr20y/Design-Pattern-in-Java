package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern;

import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.factory.LuxuryVehicleFactory;
import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.factory.OrdinaryVehicleFactory;
import com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Design Pattern or Factory Method Design Pattern....");
        /*
         * It is factory of factory
         */
        Vehicle vehicle = VehicleFactory.getVehicle(new LuxuryVehicleFactory(), "Mercedes");
        System.out.println("Vehile Type " + vehicle.type() + " has an average of " + vehicle.average());

        Vehicle vehicle2 = VehicleFactory.getVehicle(new OrdinaryVehicleFactory(), "Maruti");
        System.out.println("Vehile Type " + vehicle2.type() + " has an average of " + vehicle2.average());
    }
}
