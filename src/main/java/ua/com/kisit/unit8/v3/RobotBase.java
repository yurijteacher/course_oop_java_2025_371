package ua.com.kisit.unit8.v3;

public class RobotBase extends Robot {

    private String color = "red";

    private String model = "T1000";

    public RobotBase() {
    }

    public RobotBase(Head head, Leg leg, Hand hand, String color, String model) {
        super(head, leg, hand);
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void forward() {
        System.out.println("dance");
    }

    @Override
    public String toString() {
        return "RobotBase{" +
                "," + super.toString() +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
