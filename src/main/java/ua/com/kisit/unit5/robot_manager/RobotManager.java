package ua.com.kisit.unit5.robot_manager;

import ua.com.kisit.unit5._default.RobotDefaultVar;
import ua.com.kisit.unit5._private.RobotPrivateVar;
import ua.com.kisit.unit5._protected.RobotProtectedVar;
import ua.com.kisit.unit5._public.RobotPublicVar;

public class RobotManager {

    public static void main(String[] args) {

        RobotDefaultVar robotDefaultVar = new RobotDefaultVar();
//        robotDefaultVar.x = 0;
//        robotDefaultVar.y = 0;

        RobotPublicVar robotPublicVar = new RobotPublicVar();
        robotPublicVar.x = robotPublicVar.y = robotPublicVar.course = 10;
        robotPublicVar.x = 15;
        robotPublicVar.y = 15;

        RobotProtectedVar robotProtectedVar = new RobotProtectedVar();
//        robotProtectedVar.x = 0;

        RobotPrivateVar robotPrivateVar = new RobotPrivateVar();
//        robotPrivateVar.x = 0;

    }
}
