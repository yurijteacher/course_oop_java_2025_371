package ua.com.kisit.unit9.generalizations;

import ua.com.kisit.unit5.object_project.RobotBase;

public class Main {

    public static void main(String[] args) {

        Robot robotBase = new Robot(1L,"T2000");

        robotBase.setId(1L);
        robotBase.setModel("T-1000");

        System.out.println(robotBase);
        robotBase.forward();

    }

}
