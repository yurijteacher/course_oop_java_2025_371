package ua.com.kisit.unit10.structural_patterns.decorator;

public class Main
{

    public static void main(String[] args) {

        Component component = new ColorDecorator(new PanelDecorator(new PanelDecorator(new TextComponent())));
        component.draw();

    }
}
