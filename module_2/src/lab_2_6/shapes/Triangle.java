package module_2.src.lab_2_6.shapes;

import static java.lang.Math.sqrt;

/**
 * Created by andrew on 11.02.17.
 */

/*
                    =========Lab Work 2-6-5=========

Create project MyCalc.
        Create class Main with main() method in package com.brainacad.calc.
        Create class Triangle in package com.brainacad.shapes with three double data fields
        named “a”, “b”, and “c” with default values 1.0 to denote three sides of the triangle.
        Add constructor with (a,b,c) parameters and creates a triangle with specified a, b, and c
        values. Add method named getArea() that returns the area if this triangle using Heron
        formula:
        Use static import from Math class.
        Create instance of Triangle in Main class and test getArea() method.
*/


public class Triangle {

    double a, b, c;

    public Triangle() {

        a = 1;
        b = 1;
        c = 1;
    }

    public Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {

        double s = (a + b + c) / 2;
        double area = sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area is: " + area);

        return area;


    }


}
