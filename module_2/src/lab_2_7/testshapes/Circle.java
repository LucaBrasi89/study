package module_2.src.lab_2_7.testshapes;

import static java.lang.Math.*;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */
class Circle extends Shape {

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


}
