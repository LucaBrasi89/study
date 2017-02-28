package lab_2_2;

/**
 * Created by andrew on 32.02.27.
 */

    /*
    =====Laboratory work 2.2.2=====

    приводит в действие класс MATRIX.*/

public class UseMatrix {

    public static void main(String[] args) {

        Matrix matrix1 = new Matrix();

        int[][] matrix1vals = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2vals = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Matrix matrix2 = new Matrix();

        matrix1.addition(matrix1vals, matrix2vals);
        matrix1.multiplication(matrix1vals, matrix2vals);
    }
}
