package module_2.src.lab_2_2;

/**
 * Created by andrew on 02.02.17.
 */
/*

        =====Laboratory work 2.2.5=====

    Создать класс с методами для вычисления площади круга, прямоугольника,
    квадрата.

*/



public class A {

    //    прямоугольник
    public int calcSquare (int rectangeleSide1, int rectangeleSide2) {

        int square = rectangeleSide1 * rectangeleSide2;
        System.out.println("Rectangle square is: " + square);

        return square;

    }

    //    квадрат
    public int calcSquare (int forsquareSide) {

        int square = forsquareSide ^ 2;
        System.out.println("Forsquare square is: " + square);

        return square;

    }

    //    окружность
    public double calcSquare(double diametre) {

        double square = Math.PI * ((diametre*diametre)/4);
        System.out.println("Circle square is: " + square);

        return square;

    }



}
