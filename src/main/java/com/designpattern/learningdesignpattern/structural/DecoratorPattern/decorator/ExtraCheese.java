package com.designpattern.learningdesignpattern.structural.DecoratorPattern.decorator;

import com.designpattern.learningdesignpattern.structural.DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }

}
