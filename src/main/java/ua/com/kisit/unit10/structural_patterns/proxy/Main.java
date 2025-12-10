package ua.com.kisit.unit10.structural_patterns.proxy;

public class Main {


    public static void main(String[] args) {

        MyImage myImage = new MyImage("1.jpg");
        myImage.display();

        Proxy proxy = new Proxy("1.jpg");
        proxy.display();


    }

}
