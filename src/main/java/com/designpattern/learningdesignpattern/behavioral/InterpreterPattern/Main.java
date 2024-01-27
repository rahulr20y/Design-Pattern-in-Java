package com.designpattern.learningdesignpattern.behavioral.InterpreterPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("");

        Context context = new Context();
        context.put("a", 2);
        context.put("b", 3);
        context.put("c", 4);
        context.put("d", 5);
        // (a*b)+(c*d)
        AbstractExpression abstractExpression = new BinaryNonTeminalExpression(
                new BinaryNonTeminalExpression(new NumberTeminalExpression("a"), new NumberTeminalExpression("b"), '*'),
                new BinaryNonTeminalExpression(new NumberTeminalExpression("c"), new NumberTeminalExpression("d"), '*'),
                '+');
        System.out.println(abstractExpression.interprete(context));
    }
}
