package ua.com.kisit.unit12.ibm;

import org.springframework.stereotype.Component;
import ua.com.kisit.unit12.Base;

@Component
public class IbmBase implements Base {
    @Override
    public void init() {
        System.out.println("Apple Base");
    }
}
