package com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.Invoker;

import java.util.Stack;

import com.designpattern.learningdesignpattern.behavioral.CommandPattern.Solution1WithCommandPattern.command.Command;

public class RemoteControl {
    Stack<Command> commandHistory = new Stack<>();
    Command command;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.add(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }
}
