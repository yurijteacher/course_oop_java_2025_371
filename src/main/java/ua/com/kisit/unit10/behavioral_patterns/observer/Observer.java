package ua.com.kisit.unit10.behavioral_patterns.observer;

import jdk.jfr.Event;

import java.util.List;

public interface Observer {

    void handleEvent(List<String> vacancies);
}
