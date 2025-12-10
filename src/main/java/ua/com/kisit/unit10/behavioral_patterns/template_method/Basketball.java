package ua.com.kisit.unit10.behavioral_patterns.template_method;

public class Basketball implements Game{

    @Override
    public void init() {
        System.out.println("Basketball init");
    }

    @Override
    public void play() {
        System.out.println("Basketball play");
    }

    @Override
    public void stop() {
        System.out.println("Basketball stop");
    }


}
