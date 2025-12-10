package ua.com.kisit.unit10.behavioral_patterns.stategy;

public class StrategyDiv implements Strategy{
    @Override
    public double executeStrategy(double a, double b) {
        return (b==0) ? 0 : a/b;
    }
}
