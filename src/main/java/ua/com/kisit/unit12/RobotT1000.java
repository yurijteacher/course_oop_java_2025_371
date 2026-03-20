package ua.com.kisit.unit12;

import org.springframework.stereotype.Component;

@Component("t1003")
public class RobotT1000 extends BaseRobot{

    private String color = "red";
    private String model = "T1000";

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

    public RobotT1000() {
    }

    public RobotT1000(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public RobotT1000(Base base, Hand hand, Head head, Leg leg) {
        super(base, hand, head, leg);
    }

    public RobotT1000(Base base, Hand hand, Head head, Leg leg, String color, String model) {
        super(base, hand, head, leg);
        this.color = color;
        this.model = model;
    }

    @Override
    public void dance() {
        System.out.println("Dance");
    }

    @Override
    public String toString() {
        return "RobotT1000{" +
                super.toString() +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
