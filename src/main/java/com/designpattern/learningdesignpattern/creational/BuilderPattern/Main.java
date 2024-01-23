package com.designpattern.learningdesignpattern.creational.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder Design Pattern");
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());
        Student engineeringStudent = director1.createStudent();
        System.out.println(engineeringStudent);
        Student mbaStudent = director2.createStudent();
        System.out.println(mbaStudent);
    }
}
