package module_1.lab_1_6;

import java.util.Arrays;

/**
 * Created by andrew on 27.01.17.
 */
/*
    TASK:

            Write a program, which transpose matrix (2d arrays, size 4x4)
            and outputs it to the console
*/

public class LabWork_1_6_5 {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("source Array");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\ntranspose matrix\n");
//      Учитывая постановку задачи, выводить нужно именно методом Array.toString
        int[] tempArr = new int[4];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length ; i++) {
                tempArr[i] = matrix[i][j];
            }
            System.out.println(Arrays.toString(tempArr));
        }

    }
}
