package ua.com.kisit.unit10.creational_patterns.builder;

public class Main {

    public static void main(String[] args) {

        BuilderCar builderCar = new BuilderCar();
        Car car1 = builderCar.setColor(ColorCar.blue)
                .setTransmission(Transmission.manual).build();


        Car car2 = new BuilderCar()
                .setTransmission(Transmission.automatic)
                .setEngine(Engine.l3000)
                .setColor(ColorCar.red).build();

        System.out.println(car1);
        System.out.println(car2);
    }

}
