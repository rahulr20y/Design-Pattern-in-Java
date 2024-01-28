package com.designpattern.learningdesignpattern.behavioral.TemplateMethodPattern;

public class PaymentToMerchantFlow extends PaymentFlow {

    @Override
    public void validateRequest() {
        // specifc validation for merchant flow
        System.out.println("Validate request logic of Merchant Flow");
    }

    @Override
    public void calculateFees() {
        // specific logic of calculation for merchant flow
        System.out.println("Calculate fees...");
    }

    @Override
    public void debitAmount() {
        // logic for debit amount in merchant flow
        System.out.println("Debit Amount logic");
    }

    @Override
    public void creditAmount() {
        // logic for credit amount in merchant flow
        System.out.println("Credit amount logic");
    }

}
