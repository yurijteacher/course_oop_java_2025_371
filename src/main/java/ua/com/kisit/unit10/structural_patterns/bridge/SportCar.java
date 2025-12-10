package ua.com.kisit.unit10.structural_patterns.bridge;

public class SportCar extends Car {

    public SportCar(Maker maker) {
        super(maker);
    }

    @Override
    void carDetails() {
        maker.setMaker();
        System.out.println("Sport Car");
    }

}
