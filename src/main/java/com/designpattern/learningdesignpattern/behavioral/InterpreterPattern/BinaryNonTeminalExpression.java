package com.designpattern.learningdesignpattern.behavioral.InterpreterPattern;

public class BinaryNonTeminalExpression implements AbstractExpression {

    AbstractExpression leftAbstractExpression;
    AbstractExpression rightAbstractExpression;
    char operator;

    public BinaryNonTeminalExpression(AbstractExpression leftAbstractExpression,
            AbstractExpression rightAbstractExpression, char operator) {
        this.leftAbstractExpression = leftAbstractExpression;
        this.rightAbstractExpression = rightAbstractExpression;
        this.operator = operator;
    }

    @Override
    public int interprete(Context context) {
        switch (operator) {
            case '+':

                return leftAbstractExpression.interprete(context) + rightAbstractExpression.interprete(context);
            case '*':

                return leftAbstractExpression.interprete(context) * rightAbstractExpression.interprete(context);

            default:
                return 0;
        }
    }

}
