package ua.com.kisit.unit6;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
       // robot.x = 0;
        robot.setX(10);
        robot.setY(10);
        robot.setCourse(100);
        robot.setDistance(200);
        System.out.println(robot);
    }

}
