package ua.com.kisit.unit6;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance = 0;

    private List<RobotLine> robotLineList = new ArrayList<>();

    public List<RobotLine> getRobotLineList() {
        return robotLineList;
    }

    public void setRobotLineList(List<RobotLine> robotLineList) {
        this.robotLineList = robotLineList;
    }

    public void forward() {
        double templX = x;
        double templY = y;

        x += distance * cos(toRadians(course));
        y = y + distance * sin(course * PI / 180);

//        // v.1
//        RobotLine robotLine = new RobotLine(templX, templY, x, y);
//        robotLineList.add(robotLine);
//        // v.2
//        RobotLine robotLine1 = new RobotLine();
//        robotLine1.setOldX(templX);
//        robotLine1.setOldY(templY);
//        robotLine1.setNewX(x);
//        robotLine1.setNewY(y);
//        robotLineList.add(robotLine1);
        // v.3
        robotLineList.add(new RobotLine(templX, templY, x, y));

    }

    public void backward() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Robot() {
    }

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RobotBase{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.toString());

        Robot robot1 = new Robot(4);
        System.out.println(robot1.toString());

        Robot robot2 = new Robot(1, 1);
        System.out.println(robot2.toString());

        Robot robot3 = new Robot(2, 2, 45);
        System.out.println(robot3.toString());

        Robot robot4 = new Robot(0.1, 0.3, 45, 100);
        System.out.println(robot4.toString());

        robot4.x = 1;
        robot4.y = 2;
        robot4.course = 3;
        robot4.distance = 101;
        System.out.println(robot4.toString());

        robot4.x = 0;
        robot4.y = 0;
        robot4.course = 90;
        robot4.distance = 100;

        System.out.println("до зміни:" + robot4.toString());
        robot4.forward();

        System.out.println("після зміни:" + robot4.toString());
        System.out.println(robot4);

        robot4.setCourse(45);
        robot4.distance = 100;
        robot4.forward();
        System.out.println(robot4);

    }

}
