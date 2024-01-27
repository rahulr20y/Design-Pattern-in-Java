package com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.command;

import com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.receiver.AirConditioner;

public class TurnACOnCommand implements Command {
    AirConditioner ac;

    public TurnACOnCommand(AirConditioner airConditioner) {
        this.ac = airConditioner;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }

}
