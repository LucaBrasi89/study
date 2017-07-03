package lab_2_4;

import java.util.Arrays;

/**
 * Created by andrew on 04.02.17.
 */

/*  =====Laboratory work 2.4.1=====
    TASK:
        Create class MyMath with two static methods (findMin and findMax),
        which will take array of int values as argument and return minimum element
        value (for findMin method) or maximum element value (for findMax method).

    =====Laboratory work 2.4.3=====
    TASK:
    Add to class MyMath final static field PI = 3.14 and static method areaOfCircle(),
    which will take radius, use constant PI and calculate area.


*/

public class MyMath {

    static final double PI = 3.14;

    public static int findMin(int[] arr) {

        Arrays.sort(arr);

        System.out.println("Minimal emement is: " + arr[0]);
        return arr[0];
    }

    public static int findMax(int[] arr) {

        Arrays.sort(arr);

        System.out.println("Maxiamal element is: " + arr[arr.length -1 ]);
        return arr[arr.length - 1];
    }


    public static double areaOfCircle(int radius) {

        double square = PI * radius * radius;

        System.out.println("Площадь круга равна: " + square);
        return square;

    }


}
