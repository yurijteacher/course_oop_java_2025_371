package ua.com.kisit.unit5;

public class MyProject {

    static double x = 5;
    static double y = 6;
    static final double z = 7;

    public static void main(String[] args) {

        // z++;
        x++;
        y++;

        System.out.println(x + y);

        addNumber();
        subtractNumber(10,5);
        double c = multiplyNumber(10,5);
        System.out.println(c);

        NewClass.addNumber(10,10);
    }

    public static void addNumber() {
        x++;
        y++;
        System.out.println(x + y);
    }

    public static void subtractNumber(int x, int y) {
        System.out.println(x - y);
    }

    public static double multiplyNumber(double x, double y) {
        return x * y;
    }

}
