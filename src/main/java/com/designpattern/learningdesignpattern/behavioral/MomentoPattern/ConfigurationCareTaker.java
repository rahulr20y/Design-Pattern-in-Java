package com.designpattern.learningdesignpattern.behavioral.MomentoPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMomento> history = new ArrayList<>();

    public void addMomento(ConfigurationMomento momento) {
        history.add(momento);
    }

    public ConfigurationMomento undo() {
        if (!history.isEmpty()) {
            // get the last momento from history
            int lastMomentoIndex = history.size() - 1;
            ConfigurationMomento lastMomento = history.get(lastMomentoIndex);
            // remove the last momento from history
            history.remove(lastMomentoIndex);
            return lastMomento;

        }
        return null;
    }
}
