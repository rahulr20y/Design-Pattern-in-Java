package com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithoutCommandPattern;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOnAC();
        ac.setTemperature(22);
        ac.turnOffAC();

        Bulb bulb = new Bulb();
        bulb.turnOnBulb();
        bulb.turnOffBulb();
    }
}
