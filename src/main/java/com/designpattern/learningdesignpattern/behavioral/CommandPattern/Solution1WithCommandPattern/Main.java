package com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern;

import com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.Invoker.RemoteControl;
import com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.command.TurnACOnCommand;
import com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.receiver.AirConditioner;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        /*
         * Problem with above implementation
         * 1. lack of abstraction: process of turning AC on is simple but if there are
         * more steps, client has to aware of all that, which is not good
         * 2. Undo/Redo Functionality: undo/redo functionality needed
         * 3. Difficulty in code maintainance: what if in future we have to support more
         * commands, for more devices example bulb.
         * 
         * Solution:
         * Receiver, Invoker , Command
         */

        // AC Object
        AirConditioner airConditioner = new AirConditioner();

        // Remote
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
