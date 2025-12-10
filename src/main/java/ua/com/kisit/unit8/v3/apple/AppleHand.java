package ua.com.kisit.unit8.v3.apple;

import ua.com.kisit.unit8.v3.Hand;

public class AppleHand implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("Apple hand is taking something");
    }
}
