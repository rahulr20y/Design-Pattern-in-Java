package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern;

public class Maruti implements Vehicle {

    @Override
    public int average() {
        return 40;
    }

    @Override
    public String type() {
        System.out.println("I am a Maruti Car");
        return "Ordinary Car Maruti";
    }

}
