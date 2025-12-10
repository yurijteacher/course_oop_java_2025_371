package ua.com.kisit.unit8.v2;

public interface Calculation {

    double x = 0;

    double add(double a, double b);
    double sub(double a, double b);

    static double mul(double a, double b){
        return a * b;
    }

    default double div(double a, double b){

//        double c;
//        if(b != 0){
//            c = a / b;
//        } else {
//            c = 0;
//        }
//        return c;

        return (b!=0) ? a / b : 0;
    }

}
