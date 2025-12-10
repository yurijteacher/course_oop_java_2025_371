package ua.com.kisit.unit10.creational_patterns.builder;

public class Car {

    private String model;
    private ColorCar color;
    private SizeCar size;
    private Engine engine;
    private Transmission transmission;

    public Car() {
    }

    public Car(String model, ColorCar color, SizeCar size, Engine engine, Transmission transmission) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ColorCar getColor() {
        return color;
    }

    public void setColor(ColorCar color) {
        this.color = color;
    }

    public SizeCar getSize() {
        return size;
    }

    public void setSize(SizeCar size) {
        this.size = size;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }
}
