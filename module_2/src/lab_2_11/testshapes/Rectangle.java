package lab_2_11.testshapes;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.02.17
 */

/*===== LAB WORK 2.7.8 =====*/

public class Rectangle extends Shape {


    private double height;
    private double length;

    public Rectangle(String shapeColor, double length, double height) {

        setShapeColor(shapeColor);
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

    public static Rectangle parseRectangle(String str) {

        String shapeColor = str.split(":")[1];
        String inputVals = str.split(":")[2];
        String length = inputVals.split(",")[0];
        String height = inputVals.split(",")[1];
        Shape.setShapeColor(shapeColor);
        Rectangle rec = new Rectangle(shapeColor, Double.parseDouble(length), Double.parseDouble(height));

        return rec;
    }

    @Override
    public String toString() {
        return "\nThis is Rectangle, " +
                "color is: " + getShapeColor() + ", length=" + getLength() + " height="
                + getHeight() + "\nShape area is: " + calcArea();
    }
}
