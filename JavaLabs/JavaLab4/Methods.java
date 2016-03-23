package com.company;

import static java.lang.Math.*;

/**
 * Created by maria on 23.03.2016.
 */
public class Methods {

    //variables
    static double y, a, b, c;

    //constructors
    Methods(){
        a = 1;
        b = 1;
        c = 1;
    }

    Methods(double a, double b, double c){
        Methods.a = a;
        Methods.b = b;
        Methods.c = c;
    }

    //methods
    public static void calculate(){
        y = ((sin(2*a))/ (a-3)) + ((atan(b)) / (c));
        System.out.println("y = " + y);
    }


    public static void calculate(double a, double b, double c){
        y = ((sin(2*a))/ (a-3)) + ((atan(b)) / (c));
        System.out.println("y = " + y);

    }
}

