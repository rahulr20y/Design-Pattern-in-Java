package com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithoutCommandPattern;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAC() {
        isOn = true;
        System.out.println("Turn on AC");
    }

    public void turnOffAC() {
        isOn = false;
        System.out.println("Turn Off AC");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature changed to: " + temperature);
    }
}
