package ua.com.kisit.unit9.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine(1L, "Seat 2000", "ads");

        Car bmw = new Car();
        bmw.setModel("BMW");
        bmw.setEngine(engine);

        Engine engine2 = bmw.getEngine();

        Car seat = new Car();
        seat.setModel("SEAT");
        seat.setEngine(engine2);

        Car skoda =  new Car(engine);
        skoda.setModel("SKODA");
    }

}
