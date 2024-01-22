package com.designpattern.learningdesignpattern.creational.FactoryPattern.factory;

import com.designpattern.learningdesignpattern.creational.FactoryPattern.Circle;
import com.designpattern.learningdesignpattern.creational.FactoryPattern.Rectangle;
import com.designpattern.learningdesignpattern.creational.FactoryPattern.Shape;
import com.designpattern.learningdesignpattern.creational.FactoryPattern.Square;

public class ShapeFactory {
    public Shape getShape(String input) {
        switch (input) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
