package ua.com.kisit.unit10.structural_patterns.bridge;

public abstract class Car {

    Maker maker;
    public Car(Maker maker) {
        this.maker = maker;
    }

    abstract void carDetails();


}
