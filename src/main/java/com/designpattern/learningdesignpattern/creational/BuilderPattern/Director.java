package com.designpattern.learningdesignpattern.creational.BuilderPattern;

public class Director {
    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(27).setAge(25).setName("Bob").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(555).setAge(66).setName("Tom").setSubjects().build();
    }
}
