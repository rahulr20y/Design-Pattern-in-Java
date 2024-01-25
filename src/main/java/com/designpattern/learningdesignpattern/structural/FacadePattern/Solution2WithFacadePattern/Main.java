package com.designpattern.learningdesignpattern.structural.FacadePattern.Solution2WithFacadePattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Handling subsytem using Facade");
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}
