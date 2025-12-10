package ua.com.kisit.unit5.object_project;

public class RobotBase {

    private double x = 0;
    private double y = 0;
    private double course = 45;
    private double distance = 100;

    public void setX(double x) {
        this.x = x;
    }

    public double getX(){
        return x;
    }


    public RobotBase() {}

    public RobotBase(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    public RobotBase(double x) {
        this.x = x;
    }

    public RobotBase(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void robotBase(double course, double distance){
        this.course = course;
        this.distance = distance;
    }

    public RobotBase(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y + ", course=" + course + ", distance=" + distance;
    }

    public static void main(String[] args) {

        RobotBase robot;
        robot = new RobotBase();

        System.out.println(robot.toString());

        robot.x=1;
        robot.y=2;
        robot.course=45;
        robot.distance=100;

        System.out.println(robot);


        RobotBase robot2 = new RobotBase(10,10,45,1000);
        System.out.println(robot2);

        robot2.robotBase(90,1000);
        System.out.println(robot2);


        RobotBase robot3 = new RobotBase(5,5);
        System.out.println(robot3);

        RobotBase robot4 = new RobotBase(1,2,3);
        System.out.println(robot4);

        RobotBase robot5 = new RobotBase(11,22,45,234);
        System.out.println(robot5);

    }


}
