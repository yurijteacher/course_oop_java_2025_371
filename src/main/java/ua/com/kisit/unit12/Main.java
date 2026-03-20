package ua.com.kisit.unit12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.kisit.unit10.creational_patterns.abstract_factory.ibm.IbmHand;
import ua.com.kisit.unit12.apple.AppleBase;
import ua.com.kisit.unit12.apple.AppleHand;
import ua.com.kisit.unit12.ibm.IbmBase;
import ua.com.kisit.unit12.sony.SonyHead;
import ua.com.kisit.unit12.sony.SonyLeg;

public class Main {

    public static void main(String[] args) {

//        AppleBase appleBase = new AppleBase();
//        AppleHand appleHand = new AppleHand();
//        IbmBase ibmBase = new IbmBase();
//        IbmHand ibmHand = new IbmHand();
//        SonyLeg sonyLeg = new SonyLeg();
//        SonyHead sonyHead = new SonyHead();
//
//        RobotT1000 t1000 = new RobotT1000(appleBase, appleHand, sonyHead, sonyLeg, "black", "T1000");

//        System.out.println(t1000);

        ApplicationContext context = new ClassPathXmlApplicationContext("all-config.xml");

//        RobotT1000 t1001 = (RobotT1000) context.getBean("t1001");
//        System.out.println(t1001);
//
//        RobotT1000 t1002 = (RobotT1000) context.getBean("t1002");
//        System.out.println(t1002);

        RobotT1000 t1003 = (RobotT1000) context.getBean("t1003");
        System.out.println(t1003);


    }

}
