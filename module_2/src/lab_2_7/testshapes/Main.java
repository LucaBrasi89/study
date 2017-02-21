package module_2.src.lab_2_7.testshapes;

import sun.security.provider.SHA;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.02.17
 */

/*===== LAB WORK 2.7.10 =====*/

/*Создать массив фигур. В массиве наплодить 5 прямоугольников, 2 круга, 2 треугольника).
Сделать методы которые считают общую сумму площадей для каждого подвида фигур.*/

public class Main {

    public static void main(String[] args) {

        double sumArea = 0;
        double sumCircleArea = 0;
        double sumRectangleArea = 0;
        double sumTriangleArea = 0;

//        массив с фигурами
        Shape[] shapes = new Shape[9];
        shapes[0] = new Rectangle("red", 11, 22);
        shapes[1] = new Rectangle("green", 11, 22);
        shapes[2] = new Rectangle("blue", 11, 22);
        shapes[3] = new Rectangle("orange", 11, 22);
        shapes[4] = new Rectangle("pink", 11, 22);
        shapes[5] = new Triangle("white", 5, 5, 5);
        shapes[6] = new Triangle("purple", 5, 5, 5);
        shapes[7] = new Circle("yellow", 22);
        shapes[8] = new Circle("cyam", 44);

//        выведем что получилось

        for (Shape curShape : shapes) {
            System.out.println(curShape);
//          определим общую сумму площадей
            sumArea = sumArea + curShape.calcArea();
//            а теперь поподробней
            if (curShape instanceof Rectangle) {
                sumRectangleArea = sumRectangleArea + curShape.calcArea();
            } else if (curShape instanceof Triangle) {
                sumTriangleArea = sumTriangleArea + curShape.calcArea();
            } else if (curShape instanceof Circle) {
                sumCircleArea = sumCircleArea + curShape.calcArea();
            }

        }

//        выхлоп наших подсчетов
        System.out.printf("\n\nTotal area is: %.3f", sumArea);
        System.out.printf("\n\nRectangle  is: %.3f", sumRectangleArea);
        System.out.printf("\n\nCircle  is: %.3f", sumCircleArea);
        System.out.printf("\n\nTriangle  is: %.3f", sumTriangleArea);


    }


}
