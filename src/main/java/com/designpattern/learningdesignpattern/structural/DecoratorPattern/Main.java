package com.designpattern.learningdesignpattern.structural.DecoratorPattern;

import com.designpattern.learningdesignpattern.structural.DecoratorPattern.decorator.ExtraCheese;
import com.designpattern.learningdesignpattern.structural.DecoratorPattern.decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new Margherita());
        System.out.println(pizza.cost());
        BasePizza pizza2 = new ExtraCheese(new Mushroom(new Farmhouse()));
        System.out.println(pizza2.cost());
    }
}
