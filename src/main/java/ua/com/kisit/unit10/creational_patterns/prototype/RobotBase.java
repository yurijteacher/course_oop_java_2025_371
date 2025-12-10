package ua.com.kisit.unit10.creational_patterns.prototype;

public class RobotBase implements Cloneable{

    String name = "base";
    String model = "T1000";
    String color = "black";

    public RobotBase() {
    }

    public RobotBase(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public RobotBase clone(String name, String model, String color) {
        return new RobotBase(name, model, color);
    }

    @Override
    public String toString() {
        return "RobotBase{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
