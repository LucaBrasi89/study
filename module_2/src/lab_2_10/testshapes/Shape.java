package lab_2_10.testshapes;

import lab_2_8.testshapes.*;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.02.17
 */

/*===== LAB WORK 2.7.6 =====*/

class Shape {

    private static String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public static void setShapeColor(String shapeColor) {
        Shape.shapeColor = shapeColor;
    }

    public static Shape parseShape(String str) {

        String shapeName = str.split(":")[0];
        Shape shape = null;

        switch (shapeName) {

            case "Circle":
                shape = Circle.parseCircle(str);
                break;
            case "Rectangle":
                shape = Rectangle.parseRectangle(str);
                break;
            case "Triangle":
                shape = Triangle.parseTriangle(str);
                break;
        }
        return shape;
    }

    public void draw() {

        System.out.println(this);

    }

}
