package lab_2_8.testshapes;

import lab_2_8.testshapes.Drawable;
import sun.security.provider.SHA;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.02.17
 */

/*===== LAB WORK 2.7.6 =====*/

abstract class Shape implements Drawable {

    private String shapeColor;

//    тут метод абстрактый, ибо на данном этапе полностью его не реализуешь
    public abstract void draw();

    public Shape(String shapeColor) {
        setShapeColor(shapeColor);
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    abstract double calcArea();


    @Override
    public String toString() {
        return "\nThis is Shape, " +
                "color is: " + shapeColor + "\nShape area is: " +
                calcArea();
    }
}
