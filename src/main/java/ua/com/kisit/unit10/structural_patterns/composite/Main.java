package ua.com.kisit.unit10.structural_patterns.composite;

public class Main {

    public static void main(String[] args) {

        Robot1 robot1 = new Robot1();
        Robot2 robot2 = new Robot2();
        Robot3 robot3 = new Robot3();

        CompositeRobots composite1 = new CompositeRobots();
        CompositeRobots composite2 = new CompositeRobots();

        composite1.addComposite(robot1);
        composite1.addComposite(robot2);

        composite2.addComposite(robot3);
        composite2.addComposite(robot1);

        CompositeRobots composite3 = new CompositeRobots();

        composite3.addComposite(composite1);
        composite3.addComposite(composite2);
        composite3.addComposite(robot3);

        composite3.action();

    }

}
