package ua.com.kisit.lab6;


public class Factory {


    public Shape createShape(String name) {

        Shape shape = null;

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
        return shape;
    }

}
