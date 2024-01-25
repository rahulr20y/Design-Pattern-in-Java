package com.designpattern.learningdesignpattern.structural.BridgePattern.Solution1WithoutBridgePattern;

public abstract class Livingthings {
    abstract public void breatheProcess();
}

// now implemetation
class Dog extends Livingthings {

    @Override
    public void breatheProcess() {
        // breathe through nose
        // inhale oxygen from air
        // exhale carbon dioxide
    }

}

class Fish extends Livingthings {

    @Override
    public void breatheProcess() {
        // breathe through gills
        // inhale oxygen from water
        // release CO2
    }

}

class Tree extends Livingthings {

    @Override
    public void breatheProcess() {
        // Breathe through leaves
        // Inhahle carbon dioxide
        // exhale oxygen though photosynthesis
    }

}