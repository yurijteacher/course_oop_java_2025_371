package ua.com.kisit.lab6;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight {

    Map<String, Shape> shapes = new HashMap<>();

    public Shape createShape(String name) {

        Shape shape = shapes.get(name);

        if (shape == null) {

            switch (name) {
                case "point":
                    shape = new Point();
                    break;
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
            }
            shapes.put(name, shape);
        }

        return shape;
    }
}