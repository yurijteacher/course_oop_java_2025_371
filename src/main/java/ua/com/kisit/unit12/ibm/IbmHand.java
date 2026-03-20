package ua.com.kisit.unit12.ibm;

import ua.com.kisit.unit12.Hand;

public class IbmHand implements Hand {
    @Override
    public void take() {
        System.out.println("Apple Hand");
    }
}
