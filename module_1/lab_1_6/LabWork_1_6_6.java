package module_1.lab_1_6;

import java.util.Arrays;

/**
 * Created by andrew on 27.01.17.
 */

//    TASK:

//    Write a program that sorts an array of average temperature values by
//    months of 2015 as follows: at first the negative values, then - positive
//    values

public class LabWork_1_6_6 {

    public static void main(String[] args) {

        int[] yearTemperature = {-10, -18, 4, 10, 17, 22, 20, 23, 15, 8, 2, -1};

        for (int i = 0; i < yearTemperature.length; i++) {
            System.out.printf("%3dth month - ( %3d) degrees%n", i + 1, yearTemperature[i]);
        }
        for (int i = 0; i < yearTemperature.length ; i++) {
            for (int j = 0; j < yearTemperature.length; j++) {
                if (yearTemperature[i] < yearTemperature[j]) {
                    int tempVal = yearTemperature[i];
                    yearTemperature[i] = yearTemperature[j];
                    yearTemperature[j] = tempVal;
                }
            }
        }
        System.out.println("\n\nSorted array of temperatures\n");
        System.out.println(Arrays.toString(yearTemperature));


    }

}


