package com.designpattern.learningdesignpattern.structural.AdapterPattern.Adapter;

import com.designpattern.learningdesignpattern.structural.AdapterPattern.Adaptee.WeightMahine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightMahine weightMahine;

    public WeightMachineAdapterImpl(WeightMahine weightMahine) {
        this.weightMahine = weightMahine;
    }

    @Override
    public Double getWeightinKg() {
        double weightInPound = weightMahine.getWeightInPound();
        double weightinKg = weightInPound * 0.45;
        return weightinKg;
    }

}
