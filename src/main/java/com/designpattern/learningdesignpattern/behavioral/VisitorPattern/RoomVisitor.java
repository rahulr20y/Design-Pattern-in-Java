package com.designpattern.learningdesignpattern.behavioral.VisitorPattern;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoom);

    public void visit(DoubleRoom doubleRoom);

    public void visit(DeluxeRoom deluxeRoom);

}
