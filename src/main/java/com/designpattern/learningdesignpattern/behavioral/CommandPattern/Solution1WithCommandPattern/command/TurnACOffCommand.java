package com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.command;

import com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.receiver.AirConditioner;

public class TurnACOffCommand implements Command {
    AirConditioner ac;

    public TurnACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }

}
