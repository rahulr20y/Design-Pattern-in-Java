package com.designpattern.learningdesignpattern.behavioral.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chain of Responsibility Design pattern..");

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR, " exception happens");
        logProcessor.log(LogProcessor.DEBUG, " debugging");
        logProcessor.log(LogProcessor.INFO, " info check");

    }

}
