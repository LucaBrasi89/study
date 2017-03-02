package lab_2_8.testshapes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */

/*===== LAB WORK 2.7.8 =====*/

public class Rectangle extends Shape implements java.lang.Comparable<Rectangle> {


    private double height;
    private double length;

    public Rectangle(String shapeColor, double length, double height) {

        super(shapeColor);
        setLength(length);
        setHeight(height);
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void draw() {

        System.out.println(this);
    }

    public double calcArea() {

        return (length * height);
    }


    @Override
    public String toString() {
        return "\nThis is Rectangle, " +
                "color is: " + getShapeColor() + ", length=" + getLength() + " height="
                + getHeight() + "\nShape area is: " + calcArea();
    }

    @Override
    public int compareTo(Rectangle toCompare) {

        if (this.calcArea() > toCompare.calcArea()) return 1;
        if (this.calcArea() < toCompare.calcArea()) return -1;
        else return 0;

    }


}
