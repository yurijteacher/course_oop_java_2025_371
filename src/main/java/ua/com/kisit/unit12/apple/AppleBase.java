package ua.com.kisit.unit12.apple;

import org.springframework.stereotype.Component;
import ua.com.kisit.unit12.Base;

 // appleBase
//@Component
public class AppleBase implements Base {
    @Override
    public void init() {
        System.out.println("Apple Base");
    }
}
