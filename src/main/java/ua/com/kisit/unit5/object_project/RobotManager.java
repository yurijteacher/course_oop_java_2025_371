package ua.com.kisit.unit5.object_project;

public class RobotManager {

    public static void main(String[] args) {

        RobotBase robot = new RobotBase(11,22,45,234);
//        robot.x = 0;
//        robot.y = 0;
//        robot.course = 90;

        robot.setX(10);
        System.out.println(robot.getX());


    }


}
