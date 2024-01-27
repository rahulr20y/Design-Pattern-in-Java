package com.designpattern.learningdesignpattern.behavioral.MomentoPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        /*
         * Why it is required and when to use?
         * Provides an ability to revert an object to a previous state i.e undo
         * capability and it does not the object internal implementation
         */

        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        // initial state of the originator
        ConfigurationOriginator originatorObject = new ConfigurationOriginator(5, 7);
        // save it
        ConfigurationMomento snapshot1 = originatorObject.createMomento();
        // add it to history
        careTaker.addMomento(snapshot1);

        // originator changing to new state
        originatorObject.setHeight(9);
        originatorObject.setWidth(11);
        // save it
        ConfigurationMomento snapshot2 = originatorObject.createMomento();

        careTaker.addMomento(snapshot2);

        // originator to new state
        originatorObject.setHeight(888);
        originatorObject.setWidth(888);

        ConfigurationMomento restoreMomento = careTaker.undo();
        originatorObject.restoreMomento(restoreMomento);

        System.out.println("heigh:" + originatorObject.height + " Width:" + originatorObject.width);
    }
}
