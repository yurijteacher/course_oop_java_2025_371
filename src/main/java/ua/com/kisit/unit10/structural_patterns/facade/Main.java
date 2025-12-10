package ua.com.kisit.unit10.structural_patterns.facade;

public class Main {
    public static void main(String[] args) {
           Hello hello = new Hello();
           World world = new World();
           hello.printHello();
           world.printWorld();

           new Facade().printHelloWorld();
    }
}
