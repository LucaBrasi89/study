package module_2.src.lab_2_2;

import java.util.Arrays;

/**
 * Created by andrew on 31.01.17.
 */

/*

    =====Laboratory work 2.2.1=====

 Создать класс MATRIX который поддерживает методы умножения и сложения матриц
 между собой.
 Работает с матрицами формата 3х3.
*/


public class Matrix {


    public void addition(int[][] matrix_vals1, int[][] matrix_vals2) {

        int[][] matrix_result = new int[3][3];

        matrix_result[0][0] = matrix_vals1[0][0] + matrix_vals2[0][0];
        matrix_result[0][1] = matrix_vals1[0][1] + matrix_vals2[0][1];
        matrix_result[0][2] = matrix_vals1[0][2] + matrix_vals2[2][2];
        matrix_result[1][0] = matrix_vals1[1][0] + matrix_vals2[1][0];
        matrix_result[1][1] = matrix_vals1[1][1] + matrix_vals2[1][1];
        matrix_result[1][2] = matrix_vals1[1][2] + matrix_vals2[1][2];
        matrix_result[2][0] = matrix_vals1[2][0] + matrix_vals2[2][0];
        matrix_result[2][1] = matrix_vals1[2][1] + matrix_vals2[2][1];
        matrix_result[2][2] = matrix_vals1[2][2] + matrix_vals2[2][2];

        System.out.println("Addition result: ");
        for (int[] arr : matrix_result) {
            System.out.println(Arrays.toString(arr));
        }
    }


    public void multiplication(int[][] matrix_vals1, int[][] matrix_vals2) {

        int[][] matrix_result = new int[3][3];

        for (int i = 0; i < matrix_vals1.length; i++) {
            for (int externalJ = 0; externalJ < matrix_vals1.length; externalJ++) {
                int sum_of_expression = 0;
                for (int internalJ = 0; internalJ < matrix_vals1.length; internalJ++) {
                    sum_of_expression += (matrix_vals1[i][internalJ] * matrix_vals2[internalJ][i]);
                }
                matrix_result[i][externalJ] = sum_of_expression;
            }
        }

        System.out.println("\n\n\nMultiplying result: ");

        for (int[] arr : matrix_result) {
            System.out.println(Arrays.toString(arr));
        }
    }
}






