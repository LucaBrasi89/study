package lab_2_8.testshapes;

import java.util.Arrays;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.02.17
 */

/*===== LAB WORK 2.8.1 - 2.8.5 =====
*
    You must implement the Comparator interface to each of shape types (Rectangle, Circle,
    Triangle). Implement the compare(...) method for each of shape types class so that it
    compares the color of the shapes.
    Create an array of different shapes (size 10) and sorted in lexicographical order by color
    name. Print result to console.
* */

public class Main {

    public static void main(String[] args) {

        double sumArea = 0;
        double sumCircleArea = 0;
        double sumRectangleArea = 0;
        double sumTriangleArea = 0;

//        массив с фигурами

        Shape[] shapes = new Shape[10];
        shapes[0] = new Rectangle("red", 11, 144);
        shapes[1] = new Rectangle("white", 11, 121);
        shapes[2] = new Rectangle("black", 11, 100);
        shapes[3] = new Triangle("purple", 3,4,5);
        shapes[4] = new Triangle("orange", 20, 20,20);
        shapes[5] = new Circle("cyan", 46);
        shapes[6] = new Triangle("aloe", 22, 22,22);
        shapes[7] = new Rectangle("magenta", 14, 81);
        shapes[8] = new Rectangle("grey", 19, 81);
        shapes[9] = new Circle("zyxic", 19);
/*
        можно сортировать методом compareTo также
        Arrays.sort(rectangles, new ShapeColorComparator());
*/
        Arrays.sort(shapes, new ShapeColorComparator());
        for (Shape shape: shapes) {
            shape.draw();
        }

    }

}
