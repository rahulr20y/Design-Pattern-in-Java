package com.designpattern.learningdesignpattern.structural.AdapterPattern.Adaptee;

public class WeightMachineForBabies implements WeightMahine {

    @Override
    public double getWeightInPound() {
        return Double.valueOf(27);
    }

}
