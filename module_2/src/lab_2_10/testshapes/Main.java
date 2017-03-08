package lab_2_10.testshapes;

import java.util.Arrays;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.02.17
 */

/*===== LAB WORK 2.10.3  =====
*
    Rewrite the class Shape to add new public static method called parseShape(String)
    which returns new object as Shape (one of shapes, such as triangle, rectangle and so on)
    based on string passed as argument. Example of possible strings:
            “Rectangle:RED:10,20”;
            “Triangle:GREEN:9,7,12”;
            “Circle:BLACK:10”.
* */

public class Main {

    public static void main(String[] args) {

        Shape sh1 = Shape.parseShape("Rectangle:RED:10,20");
        System.out.println(sh1);
        Shape sh2 = Shape.parseShape("Triangle:PURPLE:40,40,40");
        System.out.println(sh2);
        Shape sh3 = Shape.parseShape("Circle:ORANGE:15");
        System.out.println(sh3);

    }
}
