package com.designpattern.learningdesignpattern.structural.DecoratorPattern.decorator;

import com.designpattern.learningdesignpattern.structural.DecoratorPattern.BasePizza;

public class Mushroom extends ToppingDecorator {
    BasePizza pizza;
    

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public int cost() {
        return this.pizza.cost() + 15;
    }
    
}
