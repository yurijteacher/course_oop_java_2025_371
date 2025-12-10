package ua.com.kisit.unit10.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        RobotBase robotBase = new RobotBase();

        List<RobotBase> robots = new ArrayList<>();


        for (int i = 0; i < 100; i++) {
            robots.add(new RobotBase("Robot"+ i, "Model T100"+i, "black"));
        }

        for (RobotBase robot : robots) {
            System.out.println(robot);
        }

    }

}
