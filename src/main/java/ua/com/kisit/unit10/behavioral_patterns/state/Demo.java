package ua.com.kisit.unit10.behavioral_patterns.state;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
