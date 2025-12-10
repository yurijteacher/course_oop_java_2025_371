package ua.com.kisit.unit10.behavioral_patterns.observer;

import java.util.List;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Subscriber " + name + " received vacancies: " + vacancies);
    }
}
