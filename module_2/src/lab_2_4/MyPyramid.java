package module_2.src.lab_2_4;

/**
 * Created by andrew on 07.02.17.
 */


/*
=====Laboratory work 2.4.6=====

    Write a class MyPyramid with public static method printPyramid(int h) that
    takes parameter an integer h between 1 and 9, and prints a pyramid of numbers
    of height h.
    Example: For h = 4 the method should print the pyramid
        1
       121
      12321
     1234321

     Построить пирамиду из чисел
*/



public class MyPyramid {

    public static void printPyramid(int h) {


        for (int i = 1; i <= h; i++) {
            for (int spaces = h; spaces >= i; spaces--) {

                System.out.print(" ");

            }
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();


        }


    }


}
