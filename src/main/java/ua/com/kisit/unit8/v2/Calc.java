package ua.com.kisit.unit8.v2;

public class Calc implements Calculation, Information {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public void print() {
        System.out.println("Info Calculator");
    }

}
