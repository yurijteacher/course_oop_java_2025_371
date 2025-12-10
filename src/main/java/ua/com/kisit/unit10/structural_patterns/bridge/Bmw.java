package ua.com.kisit.unit10.structural_patterns.bridge;

public class Bmw implements Maker{
    @Override
    public void setMaker() {
        System.out.println("Bmw Co");
    }
}
