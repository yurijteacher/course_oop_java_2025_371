package ua.com.kisit.unit10.structural_patterns.bridge;

public class Main {

    public static void main(String[] args) {

        Car car = new SportCar(new Bmw());
        car.carDetails();
        Car car2 = new CityCar(new Seat());
        car2.carDetails();


    }
}
