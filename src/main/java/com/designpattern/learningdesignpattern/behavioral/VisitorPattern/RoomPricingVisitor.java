package com.designpattern.learningdesignpattern.behavioral.VisitorPattern;

public class RoomPricingVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing Computation Logic for Single Room");
        singleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Price Computation logic for double room");
        doubleRoom.roomPrice = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("price computation logic for Deluxe room");
        deluxeRoom.roomPrice = 5000;
    }

}
