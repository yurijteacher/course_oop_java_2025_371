package ua.com.kisit.unit8.v2;

public class Main {

    public static void main(String[] args) {
        Calculation calculation = new Calc();

        System.out.println(calculation.add(1, 1));
        System.out.println(calculation.sub(1, 2));

        System.out.println(calculation.div(2, 1));

        System.out.println(Calculation.mul(2, 1));
    }


}
