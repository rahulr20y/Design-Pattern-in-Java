package com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithoutCommandPattern;

public class Bulb {
    boolean isOn;

    public void turnOnBulb() {
        isOn = true;
        System.out.println("Bulb is on");
    }

    public void turnOffBulb() {
        isOn = false;
        System.out.println("Bulb is off");
    }
}
