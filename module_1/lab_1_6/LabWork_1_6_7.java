/**
 * Created by andrew on 22.01.17.
 */


/*TASK:

        Write a program, which finds in a given matrix the area of equal
        numbers. Here is one example with an area containing 7 elements with
        equal value of 1:*/


public class LabWork_1_6_7 {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {1, 2, 3, 1, 1}, {3, 3, 3, 1, 2}, {4, 4, 4, 4, 4}};
        int src = 1;


//        вывод матрицы на глаза
        for (int i = 0; i < array.length; i++) {


            for (int j = 0; j < array[i].length; j++) {


                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();

        }

        System.out.printf("%n%n");


//        поиск в матрице нужного значения

        for (int i = 0; i < array.length; i++) {

            System.out.printf("Line %d: ", i);
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == src) {
                    System.out.printf("%d ", j);
                }


            }
            System.out.println();


        }

    }


}











