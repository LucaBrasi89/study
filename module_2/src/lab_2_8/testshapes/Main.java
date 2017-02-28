package lab_2_8.testshapes;

import sun.security.provider.SHA;

import java.util.Arrays;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.02.17
 */

/*===== LAB WORK 2.8.1 =====*/



public class Main {

    public static void main(String[] args) {

        double sumArea = 0;
        double sumCircleArea = 0;
        double sumRectangleArea = 0;
        double sumTriangleArea = 0;

//        массив с фигурами
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle("red", 11, 22);
        shapes[1] = new Triangle("purple", 5, 5, 5);
        shapes[2] = new Circle("yellow", 22);

        Rectangle[] rectangles = new Rectangle[6];
        rectangles[0] = new Rectangle("red", 11, 144);
        rectangles[1] = new Rectangle("red", 11, 121);
        rectangles[2] = new Rectangle("red", 11, 100);
        rectangles[3] = new Rectangle("red", 11, 169);
        rectangles[4] = new Rectangle("red", 11, 212);
        rectangles[5] = new Rectangle("red", 11, 81);
        Arrays.sort(rectangles);
        for (Rectangle rectngl: rectangles) {
            System.out.println(rectngl);
        }





    }


}
