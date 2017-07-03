package lab_2_14.TestGenerics2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        23.03.17
 */
public class MyTestMethod {


    public static <T extends Comparable<T>> void calcNum(T[] arr, T maxElem) {

        int counter = 0;
        Arrays.sort(arr);
        MyTestMethod.printVals(arr);

        for (T elem : arr) {
            if (elem.compareTo((T) maxElem) == 1) {
                counter++;
            }
        }
        System.out.println("Количество элементов которое больше чем " + maxElem +
                " - составляет " + counter);

    }

    public static <T> void printVals(T[] arr) {

        for (T elem : arr) {
            System.out.print(elem + "  ");
        }
        System.out.println();
    }

    public static <T extends Number & Comparable<T>> void calcSum(T[] arr, T maxElem) {

        int counter = 0;
        Double sum = 0.0;

        Arrays.sort(arr);
        MyTestMethod.printVals(arr);

        for (T elem : arr) {
            if (elem.compareTo((T) maxElem) == 1) {
                sum = sum + elem.doubleValue();
            }
        }
        System.out.println("Сумма элементов которое больше чем " + maxElem +
                " - составляет " + sum);

    }
}

