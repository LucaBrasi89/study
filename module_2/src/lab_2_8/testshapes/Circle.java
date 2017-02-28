package lab_2_8.testshapes;

import static java.lang.Math.*;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */

 /*===== LAB WORK 2.7.7 =====*/

class Circle extends Shape implements Comparetable {

    private double radius;

    public Circle(String shapeColor, double radius) {

        super(shapeColor);
        setRadius(radius);

    }

    public double calcArea() {

        return (PI * pow(radius, 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "\nThis is Circle, " +
                "color is: " + getShapeColor() + ", radius=" + getRadius() +
                "\nShape area is: " + calcArea();
    }



    @Override
    public int compareTo(Shape toCompare) {

        if (this.calcArea() > toCompare.calcArea()) return 1;
        if (this.calcArea() < toCompare.calcArea()) return -1;
        else return 0;

    }
}
