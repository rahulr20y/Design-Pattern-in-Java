package com.designpattern.learningdesignpattern.behavioral.VisitorPattern;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
