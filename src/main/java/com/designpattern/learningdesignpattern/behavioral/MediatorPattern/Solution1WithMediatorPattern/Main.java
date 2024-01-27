package com.designpattern.learningdesignpattern.behavioral.MediatorPattern.Solution1WithMediatorPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator Behavioral Design Pattern");
        /*
         * It encourages loose coupling by keeping objects from referring to each other
         * explicitly and allows them to communicate through a mediator object
         */

        AuctionMediator auctionMediator = new Auction();
        Colleague bidder1 = new Bidder("A", auctionMediator);
        Colleague bidder2 = new Bidder("B", auctionMediator);
        Colleague bidder3 = new Bidder("C", auctionMediator);
        bidder3.placeBid(27);

    }

}
