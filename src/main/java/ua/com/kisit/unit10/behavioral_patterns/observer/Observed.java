package ua.com.kisit.unit10.behavioral_patterns.observer;

public interface Observed {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
