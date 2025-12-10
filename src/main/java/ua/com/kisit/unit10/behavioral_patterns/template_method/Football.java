package ua.com.kisit.unit10.behavioral_patterns.template_method;

public class Football implements Game{

    @Override
    public void init() {
        System.out.println("init football");
    }

    @Override
    public void play() {
        System.out.println("play football");
    }

    @Override
    public void stop() {
        System.out.println("stop football");
    }
}
