package com.designpattern.learningdesignpattern.structural.BridgePattern.Solution1WithBridgePattern;

import com.designpattern.learningdesignpattern.structural.BridgePattern.Solution1WithBridgePattern.bridge.LandBreatheImpl;
import com.designpattern.learningdesignpattern.structural.BridgePattern.Solution1WithBridgePattern.bridge.WaterBreatheImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge structural design pattern");
        System.out.println("Bridge vs strategy");

        Livingthings dog = new Dog(new LandBreatheImpl());
        dog.breathe();

        Livingthings fish = new Fish(new WaterBreatheImpl());
        fish.breathe();

    }
}