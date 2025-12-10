package ua.com.kisit.unit6;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    public RobotExt() {}

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    public RobotExt(double x, double y, double course, double distance, double totalDistance) {
        super(x, y, course, distance);
        this.totalDistance = totalDistance;
    }

    @Override
    public void forward() {
        super.forward();
        totalDistance += getDistance();
    }

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt();
        robotExt.setX(0);
        robotExt.setY(0);
        robotExt.setCourse(90);
        robotExt.setDistance(200);

        System.out.println(robotExt);

        robotExt.forward();
        System.out.println(robotExt);

        robotExt.setCourse(90);
        robotExt.setDistance(200);

        robotExt.forward();
        System.out.println(robotExt);


//        robotExt
//                .getRobotLineList()
//                .forEach(System.out::println);

        for(RobotLine el : robotExt.getRobotLineList()) {
            System.out.println(el);
        }

    }

    @Override
    public String toString() {
        return super.toString() + ", totalDistance=" + totalDistance;
    }

}
