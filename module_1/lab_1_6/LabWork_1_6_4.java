package module_1.lab_1_6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by andrew on 26.01.17.
 */

    /* Бинарный поиск. Ищет значения в отсортированном массиве. */

public class LabWork_1_6_4 {

    public static void main(String[] args) {

        int searching_val = 169;
        /*создадим массив*/
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%dth item contain %d value %n", i, (i * i));
            arr[i] = i * i;

        }
        System.out.println();

        int begin = 0;
        int end = arr.length - 1;
        int middle = (arr.length) / 2;

        while (true) {

            if (searching_val > arr[middle]) {
                begin = ++middle;
                middle = (begin + end) / 2;
            } else if (searching_val < arr[middle]) {
                end = --middle;
                middle = (begin + end) / 2;
            } else {
                break;
            }
        }
        System.out.printf("Searching value is placed in %dth index \n\n", middle);
    }
}
