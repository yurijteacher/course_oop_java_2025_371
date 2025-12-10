package ua.com.kisit.unit5._default;

public class RobotDefaultVar {

    double x=0;
    double y=0;
    double course = 0;
    double distance = 0;

    public RobotDefaultVar() {}

    public RobotDefaultVar(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RobotDefaultVar{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

        RobotDefaultVar robotDefaultVar = new RobotDefaultVar(1,2,3,4);
        System.out.println(robotDefaultVar);
        robotDefaultVar.x = 0;
        robotDefaultVar.y = 0;
        robotDefaultVar.course = 0;
        robotDefaultVar.distance = 0;

    }
}
