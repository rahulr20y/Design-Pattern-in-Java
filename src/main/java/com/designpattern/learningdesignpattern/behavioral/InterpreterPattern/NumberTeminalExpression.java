package com.designpattern.learningdesignpattern.behavioral.InterpreterPattern;

public class NumberTeminalExpression implements AbstractExpression {

    String key;

    public NumberTeminalExpression(String key) {
        this.key = key;
    }

    @Override
    public int interprete(Context context) {
        return context.get(key);
    }

}
