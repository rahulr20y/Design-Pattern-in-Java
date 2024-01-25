package com.designpattern.learningdesignpattern.structural.FacadePattern.Solution1WithFacadePattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.getEmployeeDetails(556222);
    }
}
