package ua.com.kisit.unit5._public;

public class RobotPublicVar {

    public double x=0;
    public double y=0;
    public double course = 0;
    public double distance = 0;

    public RobotPublicVar() {
    }

    public RobotPublicVar(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RobotPublicVar{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

        RobotPublicVar robotPublicVar = new RobotPublicVar();
        robotPublicVar.x = robotPublicVar.y = robotPublicVar.course = robotPublicVar.distance = 10;
    }
}
