package com.designpattern.learningdesignpattern.SOLID;

public class InterfaceSegmentedPrinciple {
    public static void main(String[] args) {
        System.out.println(
                "Interfaces should be such that client should not implement unneccessary functions they don't need");
    }
}

// problem statement
interface RestaurantEmployee {
    void washDishes();

    void serveCustomers();

    void cookFood();
}

class WaiterP implements RestaurantEmployee {

    @Override
    public void washDishes() {
        // not my Job
        throw new UnsupportedOperationException("Unimplemented method 'washDishes'");
    }

    @Override
    public void serveCustomers() {
        // yes and here is my implementation
        System.out.println("Serving the customers");
    }

    @Override
    public void cookFood() {
        // not my job
        throw new UnsupportedOperationException("Unimplemented method 'cookFood'");
    }

}

// solution

interface WaiterInterface {
    void serveCustomers();

    void takeOrder();
}

interface ChefInterface {
    void cookFood();

    void decideMenu();
}

class Waiter implements WaiterInterface {

    @Override
    public void serveCustomers() {
        System.out.println("serving the customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("taking orders");
    }

}

class Chef implements ChefInterface {

    @Override
    public void cookFood() {
        System.out.println("Cooking Food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Menu Desicion");
    }

}