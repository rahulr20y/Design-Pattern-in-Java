package com.designpattern.learningdesignpattern.creational.AbstractFactoryPattern;

public class Mercedes implements Vehicle {

    @Override
    public int average() {
        return 22;
    }

    @Override
    public String type() {
        System.out.println("I am Mercedes Car");
        return "Luxury Car Mercedes";
    }

}
