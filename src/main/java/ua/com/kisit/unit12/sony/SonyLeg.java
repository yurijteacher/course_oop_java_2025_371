package ua.com.kisit.unit12.sony;

import org.springframework.stereotype.Component;
import ua.com.kisit.unit12.Leg;

@Component
public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Sony Leg");
    }
}
