package ua.com.kisit.unit12.apple;

import org.springframework.stereotype.Component;
import ua.com.kisit.unit12.Hand;

@Component
public class AppleHand implements Hand {
    @Override
    public void take() {
        System.out.println("Apple Hand");
    }
}
