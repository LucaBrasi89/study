package module_1.lab_1_6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by andrew on 25.01.17.
 */

/*
    TASK:

        There are statistics for the year by months as an array:
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Write code which calculates the maximum value from the array,
        the minimum value and the average.
*/

public class LabWork_1_6_2 {

    public static void main(String[] args) {

        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
//      firstly we are sorting array


        Arrays.sort(m);

        for (int item : m) {

            System.out.println(item+"\n");

        }
        System.out.println("Minimal value is - " + m[0]);


//      looking for average value
        int averageIndex = ((m.length-1) / 2);
        System.out.println("Average value is - " + m[averageIndex]);

        System.out.println("Maximal value is - " + m[m.length - 1]);


    }

}
