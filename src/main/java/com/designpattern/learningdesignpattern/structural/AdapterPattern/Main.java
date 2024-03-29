package com.designpattern.learningdesignpattern.structural.AdapterPattern;

import com.designpattern.learningdesignpattern.structural.AdapterPattern.Adaptee.WeightMachineForBabies;
import com.designpattern.learningdesignpattern.structural.AdapterPattern.Adapter.WeightMachineAdapter;
import com.designpattern.learningdesignpattern.structural.AdapterPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Structural Design pattern...");
        /*
         * It act as a bridge or intermediate between 2 incompatible interfaces
         */
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightinKg());
    }
}
