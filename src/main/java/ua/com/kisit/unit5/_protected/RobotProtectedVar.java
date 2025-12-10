package ua.com.kisit.unit5._protected;

public class RobotProtectedVar {

    protected double x = 10;
    protected double y = 10;
    protected double course = 10;
    protected double distance = 10;

    public RobotProtectedVar() {
    }

    public RobotProtectedVar(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RobotProtectedVar{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

        RobotProtectedVar robotProtectedVar = new RobotProtectedVar();
        System.out.println(robotProtectedVar);
        robotProtectedVar.x = 10;
        robotProtectedVar.y = 10;

    }
}
