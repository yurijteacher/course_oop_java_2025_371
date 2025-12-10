package ua.com.kisit.unit10.structural_patterns.facade;

public class Facade {

    public void printHelloWorld() {
        Hello hello = new Hello();
        World world = new World();
        hello.printHello();
        world.printWorld();
    }

}
