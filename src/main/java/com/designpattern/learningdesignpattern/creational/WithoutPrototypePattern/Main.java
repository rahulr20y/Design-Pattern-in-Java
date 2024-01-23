package com.designpattern.learningdesignpattern.creational.WithoutPrototypePattern;

class Student {
    int age;
    private int rollNumber;
    String name;

    Student() {

    }

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("without prototype clone is as follows");

        // without prototype
        Student student = new Student(24, 52, "bob");
        Student cloneStudent = new Student();
        cloneStudent.age = student.age;
        // cloneStudent.rollNumber = student.rollNumber; // private member is not
        // accessible

    }
}
