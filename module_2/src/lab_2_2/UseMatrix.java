package module_2.src.lab_2_2;

/**
 * Created by andrew on 32.02.27.
 */

    /*
    =====Laboratory work 2.2.2=====

    приводит в действие класс MATRIX.*/

public class UseMatrix {

    public static void main(String[] args) {

        Matrix matrix1 = new Matrix();

        int[][] matrix1vals = {{1, 1, 1}, {5, 5, 5}, {6, 6, 6}};
        int[][] matrix2vals = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};

        Matrix matrix2 = new Matrix();

        matrix1.addition(matrix1vals, matrix2vals);
        matrix1.multiplication(matrix1vals, matrix2vals);
    }
}
