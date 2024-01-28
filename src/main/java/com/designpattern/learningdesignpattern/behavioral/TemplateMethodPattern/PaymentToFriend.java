package com.designpattern.learningdesignpattern.behavioral.TemplateMethodPattern;

public class PaymentToFriend extends PaymentFlow {

    @Override
    public void validateRequest() {
        // specifc validation for merchant flow
        System.out.println("Validate request logic of Pay To Friend");
    }

    @Override
    public void calculateFees() {
        // specific logic of calculation for Pay To Friend
        System.out.println("Calculate fees...");
    }

    @Override
    public void debitAmount() {
        // logic for debit amount in Pay To Friend
        System.out.println("Debit Amount logic");
    }

    @Override
    public void creditAmount() {
        // logic for credit amount in Pay To Friend
        System.out.println("Credit amount logic");
    }

}
