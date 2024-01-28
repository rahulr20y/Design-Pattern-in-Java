package com.designpattern.learningdesignpattern.behavioral.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Template Method Behavioral Design Pattern");
        /*
         * Why it is required and when to use:
         * When you want all the classes to follow the specific steps to process the
         * task but also need to provide the flexibility that each can have their own
         * logic in that specific steps
         */

        PaymentFlow paymentFlow = new PaymentToFriend();
        paymentFlow.sendMoney();
        PaymentFlow paymentFlow2 = new PaymentToMerchantFlow();
        paymentFlow2.sendMoney();
    }
}
