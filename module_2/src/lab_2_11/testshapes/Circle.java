package lab_2_11.testshapes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */

 /*===== LAB WORK 2.7.7 =====*/

class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {

        setShapeColor(shapeColor);
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


    public static Circle parseCircle(String str) {

        String shapeColor = str.split(":")[1];
        String radius = str.split(":")[2];
        Shape.setShapeColor(shapeColor);
        Circle circ = new Circle(shapeColor, Double.parseDouble(radius));

        return circ;
    }

    @Override
    public String toString() {
        return "\nThis is Circle, " +
                "color is: " + getShapeColor() + ", radius=" + getRadius() +
                "\nShape area is: " + calcArea();
    }

}
