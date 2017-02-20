package module_2.src.lab_2_7.testshapes;

import static java.lang.Math.*;

import java.util.SplittableRandom;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */
public class Triangle extends Shape {

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


}
