package module_1.lab_1_6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by andrew on 26.01.17.
 */

    /*ищем значение в массиве посредством бинарного поиска*/

public class LabWork_1_6_4 {

    public static void main(String[] args) {

        int searching_val = 4;
        /*создадим массив*/
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%dth item contain %d value %n", i, (i * i));
            arr[i] = i * i;

        }
        System.out.println();


        int begin = 0;
        int end = arr.length;
        int middle = (arr.length) / 2;


        while (searching_val != middle) {

            System.out.println(middle);
            if (searching_val > arr[middle]) {

                begin = ++middle;
                end = (end - middle) /2;

            } else {

                begin =
                end = middle;

            }

        }
        System.out.println(middle);


    }

}
