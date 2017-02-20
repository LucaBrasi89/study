package module_2.src.lab_2_7.testshapes;

import sun.security.provider.SHA;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.02.17
 */
public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape("red");
        System.out.println(shape);
        Circle circle = new Circle("green", 10);
        System.out.println(circle);
        Rectangle rect = new Rectangle("red",11, 22);
        System.out.println(rect);
        Triangle tangle = new Triangle("black",5,5, 5);
        System.out.println(tangle);

    }


}
