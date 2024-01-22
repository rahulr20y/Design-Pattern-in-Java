package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern;

public class Swift implements Vehicle {

    @Override
    public int average() {
        return 35;
    }

    @Override
    public String type() {
        System.out.println("I am a Swift care");
        return "Ordinary Car Swift";
    }

}
