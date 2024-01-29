package com.designpattern.learningdesignpattern.behavioral.VisitorPattern;

class HotelRoom {
    public void getRoomPrice() {
        // price computation logic
    }

    public void initiateRoomMaintenance() {
        // start room maintenance
    }

    public void reserveRoom() {
        // perform operation to reserve room
    }

    // many more operation can come over time...
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Visitor Behavioral Design Pattern");
        /*
         * 1. Allows you to add new operations to existing classes without changing
         * their structure
         * 2. it achieves this by separating the algorithm from the objects on which it
         * operates.
         * 3. It does Double Dispatch to achive this. (Double dispatch means, method
         * which needs to be invoked decided by the caller object and the object passed
         * in the arguement)
         */

        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();
        // performing an operation on the objects
        RoomVisitor roomVisitor = new RoomPricingVisitor();
        singleRoom.accept(roomVisitor);
        System.out.println(((SingleRoom) singleRoom).roomPrice);

        doubleRoom.accept(roomVisitor);
        System.out.println(((DoubleRoom) doubleRoom).roomPrice);

        deluxeRoom.accept(roomVisitor);
        System.out.println(((DeluxeRoom) deluxeRoom).roomPrice);

        // performing another operation on the objects
        RoomVisitor roomVisitor2 = new RoomMaintenanceVisitor();
        singleRoom.accept(roomVisitor2);
        deluxeRoom.accept(roomVisitor2);
        doubleRoom.accept(roomVisitor2);

    }
}
