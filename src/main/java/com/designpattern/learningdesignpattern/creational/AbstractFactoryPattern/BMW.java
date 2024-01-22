package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern;

public class BMW implements Vehicle {

    @Override
    public int average() {
        return 15;
    }

    @Override
    public String type() {
        System.out.println("I am a BMW car");
        return "Luxury Car BMW";
    }

}
