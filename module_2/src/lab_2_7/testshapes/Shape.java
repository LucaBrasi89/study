package module_2.src.lab_2_7.testshapes;

import sun.security.provider.SHA;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.02.17
 */
public class Shape {

    private String shapeColor;


    public Shape(String shapeColor) {
        setShapeColor(shapeColor);
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {

        return 0;
    }


    @Override
    public String toString() {
        return "\nThis is Shape, " +
                "color is: " + shapeColor + "\nShape area is: " +
                calcArea();
    }
}
