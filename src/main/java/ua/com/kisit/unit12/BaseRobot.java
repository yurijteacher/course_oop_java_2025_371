package ua.com.kisit.unit12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseRobot {

    @Autowired
//    @Qualifier("appleBase")
    private Base base;

    @Autowired
    @Qualifier("appleHand")
    private Hand hand;

    @Autowired
    @Qualifier("sonyHead")
    private Head head;
    @Autowired
    @Qualifier("sonyLeg")
    private Leg leg;

    public BaseRobot() {
    }

    public BaseRobot(Base base, Hand hand, Head head, Leg leg) {
        this.base = base;
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public abstract void dance();

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "BaseRobot{" +
                "base=" + base +
                ", hand=" + hand +
                ", head=" + head +
                ", leg=" + leg +
                '}';
    }
}
