package com.designpattern.learningdesignpattern.creational.WithPrototypePattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("It is used when we have to make a copy/clone from existing object");
        Student student = new Student(27, 285, "Tom");
        System.out.println(student);
        Student clonesStudent = (Student) student.clone();
        System.out.println(clonesStudent);
    }
}
