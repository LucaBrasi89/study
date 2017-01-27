package module_1.lab_1_6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by andrew on 26.01.17.
 */

    /*ищем значение в массиве посредством бинарного поиска*/

public class LabWork_1_6_4 {

    public static void main(String[] args) {

        int searching_val = 9;
        /*создадим массив*/
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%dth item contain %d value %n", i, (i*i));
            arr[i] = i*i;

        }
        System.out.println();

        int res = Arrays.binarySearch(arr, searching_val);
        System.out.printf("Value %d was found in %dth position ", searching_val,res);
    }

}
