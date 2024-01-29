package com.designpattern.learningdesignpattern.behavioral.VisitorPattern;

public class SingleRoom implements RoomElement {

    public int roomPrice = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }

}
