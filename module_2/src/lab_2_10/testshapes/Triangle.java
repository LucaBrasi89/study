package lab_2_10.testshapes;

import static java.lang.Math.sqrt;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */

/*===== LAB WORK 2.7.9 =====*/

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;


    public Triangle(String shapeColor, double a, double b, double c) {

        setShapeColor(shapeColor);
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

    public static Triangle parseTriangle(String str) {

        String shapeColor = str.split(":")[1];
        String inputVals = str.split(":")[2];
        String a = inputVals.split(",")[0];
        String b = inputVals.split(",")[1];
        String c = inputVals.split(",")[1];
        Triangle trang = new Triangle(shapeColor, Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));

        return trang;

    }


    @Override
    public String toString() {
        return "\nThis is Triangle, " +
                "color is: " + getShapeColor() + ", a=" + getA() + " b="
                + getB() + " c=" + getC() + "\nShape area is: " + calcArea();
    }

}
