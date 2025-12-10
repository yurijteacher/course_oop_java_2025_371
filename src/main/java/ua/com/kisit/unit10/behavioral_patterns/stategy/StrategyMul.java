package ua.com.kisit.unit10.behavioral_patterns.stategy;

public class StrategyMul implements Strategy{
    @Override
    public double executeStrategy(double a, double b) {
        return a+b;
    }
}
