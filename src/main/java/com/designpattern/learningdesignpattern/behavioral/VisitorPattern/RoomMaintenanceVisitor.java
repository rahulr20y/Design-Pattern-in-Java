package com.designpattern.learningdesignpattern.behavioral.VisitorPattern;

public class RoomMaintenanceVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Performing maintenance of single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Performing maintenance of single room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Performing maintenance of single room");
    }

}
