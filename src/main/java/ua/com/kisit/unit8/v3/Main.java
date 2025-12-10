package ua.com.kisit.unit8.v3;

import ua.com.kisit.unit8.v3.apple.AppleHand;
import ua.com.kisit.unit8.v3.apple.AppleHead;
import ua.com.kisit.unit8.v3.apple.AppleLeg;
import ua.com.kisit.unit8.v3.ibm.IbmHand;
import ua.com.kisit.unit8.v3.ibm.IbmHead;
import ua.com.kisit.unit8.v3.ibm.IbmLeg;

public class Main {

    public static void main(String[] args) {

        // Robot robot = new Robot();
        AppleHand appleHand = new AppleHand();
        AppleHead appleHead = new AppleHead();
        AppleLeg appleLeg = new AppleLeg();

        IbmHand ibmHand = new IbmHand();
        IbmHead ibmHead = new IbmHead();
        IbmLeg ibmLeg = new IbmLeg();

        Robot robot = new RobotBase();
        robot.setHand(appleHand);
        robot.setHead(appleHead);
        robot.setLeg(appleLeg);

        Robot robot2 = new RobotBase();
        robot2.setHand(ibmHand);
        robot2.setHead(appleHead);
        robot2.setLeg(ibmLeg);

        System.out.println(robot);
        System.out.println(robot2);


        Robot robot3 = new RobotBase(appleHead, appleLeg, appleHand, "black","T3000");
        System.out.println(robot3);
    }
}
