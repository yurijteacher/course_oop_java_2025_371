package ua.com.kisit.unit10.behavioral_patterns.stategy;

public class StrategySub implements Strategy{
    @Override
    public double executeStrategy(double a, double b) {
        return a-b;
    }
}
