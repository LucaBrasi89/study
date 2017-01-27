package module_1.lab_1_6;

/**
 * Created by andrew on 26.01.17.
 */
    /*
    TASK:
        вывести матрцу с числами 1..16. Матрицу организовать в виде двух дыумерных
        массивов*/

public class LabWork_1_6_3 {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        int value = 1;

        for (int j = 0; j < matrix[0].length; j++) {

            for (int i = 0; i < matrix[0].length; i++) {

                matrix[i][j] = value;
                value++;

            }

        }


//        печать значений матрицы
        for (int i = 0; i < matrix[0].length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.printf("%5d ",matrix[i][j]);

            }
            System.out.println();

        }


    }

}
