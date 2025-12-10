package ua.com.kisit.unit10.creational_patterns.abstract_factory;


import ua.com.kisit.unit10.creational_patterns.abstract_factory.apple.AppleHand;
import ua.com.kisit.unit10.creational_patterns.abstract_factory.apple.AppleHead;
import ua.com.kisit.unit10.creational_patterns.abstract_factory.apple.AppleLeg;
import ua.com.kisit.unit10.creational_patterns.abstract_factory.ibm.IbmHand;
import ua.com.kisit.unit10.creational_patterns.abstract_factory.ibm.IbmHead;
import ua.com.kisit.unit10.creational_patterns.abstract_factory.ibm.IbmLeg;

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
