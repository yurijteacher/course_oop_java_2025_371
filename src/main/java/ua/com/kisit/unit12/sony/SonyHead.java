package ua.com.kisit.unit12.sony;

import org.springframework.stereotype.Component;
import ua.com.kisit.unit12.Head;

@Component
public class SonyHead implements Head {
    @Override
    public void calculation() {
        System.out.println("Sony Head");
    }
}
