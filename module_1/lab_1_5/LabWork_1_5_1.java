package module_1.lab_1_5;

/**
 * Created by andrew on 21.01.17.
 */


//Write a program to produce on console pyramid contain numbers

public class LabWork_1_5_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {

            int j = i;
            while (j != 0) {

                System.out.print(j);
                j--;

            }
            System.out.println(); //переходим на один слой ниже

        }


    }

}
