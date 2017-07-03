package lab_2_11.testshapes;

import java.util.Arrays;
import java.util.Scanner;

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

        System.out.println("Enter the length of shapes array");
        Scanner sc1 = new Scanner(System.in);
        int arrLength = Integer.parseInt(sc1.nextLine());
//        массив тел
        Shape[] shapes = new Shape[0];
//        текущая строка с фигурой
        String curInputStr;
        Shape testShape;
        for (int i = 0; i < arrLength; i++) {
            curInputStr = sc1.nextLine();
            try {
                testShape = Shape.parseShape(curInputStr);
                shapes = Arrays.copyOf(shapes, shapes.length + 1);
                shapes[shapes.length - 1] = testShape;

            } catch (InvalidShapeStringException e) {
                System.out.println("wrong input, try agiain");
                arrLength++;
            }
        }
        sc1.close();

        for (Shape sh : shapes) {
            sh.draw();

        }

        /*
        Circle:ORANGE:15
        Rectangle:RED:10,20
        Triangle:PURPLE:40,40,40
        */
    }
}
