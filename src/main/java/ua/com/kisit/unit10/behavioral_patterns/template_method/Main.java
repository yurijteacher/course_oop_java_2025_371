package ua.com.kisit.unit10.behavioral_patterns.template_method;

public class Main {

    public static void main(String[] args) {
        Basketball basketball = new Basketball();
        basketball.init();
        basketball.play();
        basketball.stop();

        Football football = new Football();
        football.init();
        football.play();
        football.stop();
    }

}
