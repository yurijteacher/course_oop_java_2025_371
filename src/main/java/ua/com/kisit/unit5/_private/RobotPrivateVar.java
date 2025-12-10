package ua.com.kisit.unit5._private;

public class RobotPrivateVar {

    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance = 0;

    public RobotPrivateVar() {}

    public RobotPrivateVar(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RobotPrivateVar{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

        RobotPrivateVar robotPrivateVar = new RobotPrivateVar();
        robotPrivateVar.x = 15;
        robotPrivateVar.y = 15;
        robotPrivateVar.course = 15;
        robotPrivateVar.distance = 15;


    }
}
