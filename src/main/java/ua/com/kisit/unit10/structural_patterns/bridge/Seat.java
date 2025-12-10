package ua.com.kisit.unit10.structural_patterns.bridge;

public class Seat implements Maker{
    @Override
    public void setMaker() {
        System.out.println("Seat Co");
    }
}
