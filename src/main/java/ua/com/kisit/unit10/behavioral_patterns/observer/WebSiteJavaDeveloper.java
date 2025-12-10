package ua.com.kisit.unit10.behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WebSiteJavaDeveloper implements Observed {

    List<String> vacancies =  new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();


    public void addNewVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(vacancies);
        }
    }
}
