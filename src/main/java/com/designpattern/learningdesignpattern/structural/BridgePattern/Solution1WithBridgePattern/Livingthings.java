package com.designpattern.learningdesignpattern.structural.BridgePattern.Solution1WithBridgePattern;

import com.designpattern.learningdesignpattern.structural.BridgePattern.Solution1WithBridgePattern.bridge.BreatheImplementor;

public abstract class Livingthings {
    BreatheImplementor breatheImplementor;

    public Livingthings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract public void breathe();

}

// implementation
class Dog extends Livingthings {

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }

}

class Fish extends Livingthings {

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }

}

class Tree extends Livingthings {

    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }

}