package module_1.lab_1_6;

/**
 * Created by andrew on 25.01.17.
 */

   /* TASK:

            Create an array of all the even numbers from 2 to 30 (2,4,6...30)
            and display elements of the array to the screen.*/


public class LabWork_1_6_1 {

    public static void main(String[] args) {

        int evenNumbArr[];
        evenNumbArr = new int[15];

        int evenIndex = 0;
        for (int i = 1; i <= 30; i++) {

            if ((i % 2) == 0) {

                evenNumbArr[evenIndex] = i;
                evenIndex++;

            }

        }

//        печать значений в массиве
        for (int item : evenNumbArr) {

            System.out.println(item);

        }


    }
}
