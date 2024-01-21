package com.designpattern.learningdesignpattern.SOLID;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        System.out.println("Class should depend on interfaces rather thank concrete classes");
    }
}

// problem statement
interface Mouse {

}

interface Keyboard {

}

class WiredMouse implements Mouse {

}

class BluetoothMouse implements Mouse {

}

class WiredKeyboard implements Keyboard {

}

class BluetoothKeyboard implements Keyboard {

}

class MacbookP {
    private final WiredKeyboard wiredKeyboard;
    private final WiredMouse wiredMouse;

    public MacbookP(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) { // concrete class
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}

// solution
class Macbook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) { // interface
        this.keyboard = keyboard;
        this.mouse = mouse;
    };
}