package ua.com.kisit.unit10.behavioral_patterns.stategy;

public class Main {

    public static void main(String[] args) {
        StrategyAdd strategyAdd = new StrategyAdd();
        StrategySub strategySub = new StrategySub();

        ContextStrategy contextStrategy = new ContextStrategy(strategyAdd);

        System.out.println(contextStrategy.executeStrategy(1, 2));

    }
}
