package com.designpattern.learningdesignpattern.creational.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("DSA");
        subjects.add("Algorithms");
        subjects.add("Java");
        this.subjects = subjects;
        return this;
    }

}
