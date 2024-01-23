package com.designpattern.learningdesignpattern.structural.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy Design Pattern");

        try {
            EmployeeDao employeeDao = new EmployeeDaoImplProxy(); // proxy layer
            employeeDao.get("USER", 0);
            System.out.println("Operation Successfull");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
