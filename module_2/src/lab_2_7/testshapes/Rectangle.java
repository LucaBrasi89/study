package module_2.src.lab_2_7.testshapes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */
class Rectangle extends Shape {


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

    public double calcArea() {

        return (length * height);
    }


    @Override
    public String toString() {
        return "\nThis is Rectangle, " +
                "color is: " + getShapeColor() + ", length=" + getLength() + " height="
                + getHeight() +"\nShape area is: " + calcArea();
    }



}
