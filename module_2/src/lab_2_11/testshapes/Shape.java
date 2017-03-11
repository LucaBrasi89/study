package lab_2_11.testshapes;

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

    public static Shape parseShape(String str) throws InvalidShapeStringException {

        boolean exeptionStatus = true; //нужен ли exception? проверим...

        if (str.matches("^[a-zA-Z]+:[a-zA-Z]+:\\d+$")) {
            exeptionStatus = false;
        } else if (str.matches("^[a-zA-Z]+:[a-zA-Z]+:\\d+,\\d+$")) {
            exeptionStatus = false;
        } else if (str.matches("^[a-zA-Z]+:[a-zA-Z]+:\\d+,\\d+,\\d+$")) {
            exeptionStatus = false;
        }
//        если не один из шаблонов не совпал, дай мне exception
        if (exeptionStatus == true) {
            throw new InvalidShapeStringException();
        }

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
