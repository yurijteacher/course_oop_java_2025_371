package ua.com.kisit.unit10.behavioral_patterns.observer;

public class Main {

    public static void main(String[] args) {

        WebSiteJavaDeveloper webSiteVacancy = new WebSiteJavaDeveloper();
        webSiteVacancy.addNewVacancy("Java Developer 5 років стажу");
        webSiteVacancy.addNewVacancy("C# Developer ");

        Observer observer1 = new Subscriber("Vasya Pypkin");
        Observer observer2 = new Subscriber("Iva Pypkina");

        webSiteVacancy.addObserver(observer1);
        webSiteVacancy.addObserver(observer2);

        webSiteVacancy.removeVacancy("C# Developer ");
        webSiteVacancy.addNewVacancy("C++ Developer ");


    }

}
