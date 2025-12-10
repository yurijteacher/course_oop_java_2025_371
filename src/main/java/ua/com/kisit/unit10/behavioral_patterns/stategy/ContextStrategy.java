package ua.com.kisit.unit10.behavioral_patterns.stategy;

public class ContextStrategy implements Strategy{

    Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public double executeStrategy(double a, double b) {
        return strategy.executeStrategy(a, b);
    }
}
