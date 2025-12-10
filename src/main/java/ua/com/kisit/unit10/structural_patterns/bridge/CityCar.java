package ua.com.kisit.unit10.structural_patterns.bridge;

public class CityCar extends Car{

    public CityCar(Maker maker) {
        super(maker);
    }

    @Override
    void carDetails() {
    maker.setMaker();
    System.out.println("City Car");
    }
}
