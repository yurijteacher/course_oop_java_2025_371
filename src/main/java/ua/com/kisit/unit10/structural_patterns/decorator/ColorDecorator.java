package ua.com.kisit.unit10.structural_patterns.decorator;

public class ColorDecorator extends Decorator{

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("Color decorator after draw");
    }
}
