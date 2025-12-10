package ua.com.kisit.unit10.structural_patterns.decorator;

public class PanelDecorator extends Decorator {


    public PanelDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("Panel draw");
    }
}
