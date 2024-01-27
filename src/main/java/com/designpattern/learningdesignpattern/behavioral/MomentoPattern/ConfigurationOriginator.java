package com.designpattern.learningdesignpattern.behavioral.MomentoPattern;

//Originator
public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMomento createMomento() {
        return new ConfigurationMomento(height, width);
    }

    public void restoreMomento(ConfigurationMomento restoreMomento) {
        this.height = restoreMomento.height;
        this.width = restoreMomento.width;
    }
}
