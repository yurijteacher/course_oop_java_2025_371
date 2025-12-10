package ua.com.kisit.unit10.creational_patterns.builder;

public class BuilderCar {

    private String model = "Seat";
    private ColorCar color = ColorCar.blue;
    private SizeCar size = SizeCar.l2700;
    private Engine engine = Engine.l2500;
    private Transmission transmission = Transmission.automatic;

    public BuilderCar setModel(String model) {
        this.model = model;
        return this;
    }

    public BuilderCar setColor(ColorCar color) {
        this.color = color;
        return this;
    }

    public BuilderCar setSize(SizeCar size) {
        this.size = size;
        return this;
    }

    public BuilderCar setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public BuilderCar setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setModel(model);
        car.setColor(color);
        car.setSize(size);
        car.setEngine(engine);
        car.setTransmission(transmission);

        return car;
    }

}
