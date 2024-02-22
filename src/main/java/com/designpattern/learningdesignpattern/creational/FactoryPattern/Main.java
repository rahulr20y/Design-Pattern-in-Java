package com.designpattern.learningdesignpattern.creational.FactoryPattern;

import com.designpattern.learningdesignpattern.creational.FactoryPattern.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern.......");
        /*
         * It is used when all the object creation business logic we need to keep at one
         * place
         */
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeCircle = shapeFactory.getShape("Circle");
        shapeCircle.draw();
    }

}
