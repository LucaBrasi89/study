package lab_2_8.testshapes;

import static java.lang.Math.*;

import java.util.SplittableRandom;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */

/*===== LAB WORK 2.7.9 =====*/

public class Triangle extends Shape implements Comparetable {

    private double a;
    private double b;
    private double c;


    public Triangle(String shapeColor, double a, double b, double c) {

        super(shapeColor);
        setA(a);
        setB(b);
        setC(c);

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    public double calcArea() {

        double s = (a + b + c) / 2;

        return (sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    public String toString() {
        return "\nThis is Triangle, " +
                "color is: " + getShapeColor() + ", a=" + getA() + " b="
                + getB() + " c=" + getC() + "\nShape area is: " + calcArea();
    }


    @Override
    public int compareTo(Shape toCompare) {

        if (this.calcArea() > toCompare.calcArea()) return 1;
        if (this.calcArea() < toCompare.calcArea()) return -1;
        else return  0;

    }
}
