package com.designpattern.learningdesignpattern.creational.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Micro Economics");
        subjects.add("Buisness Studies");
        subjects.add("Operations Management");
        this.subjects = subjects;
        return this;
    }

}
