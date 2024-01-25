package com.designpattern.learningdesignpattern.structural.FacadePattern.Solution1WithFacadePattern;

public class Employee {
    private int id;
    private String name;

    public Employee() {

    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
