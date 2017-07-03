package module_1.lab_1_5;

/**
 * Created by andrew on 21.01.17.
 */

/*
Опять инкремент с шагом 1. Проделать от 1 до n. Сложить все эти значения между
собой и вычислить среднее
*/

public class LabWork_1_5_5 {

    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;
        int n = 14;

        for (int i = 1; i <= n; i++) {

            sum = sum + i;
            counter++;

        }

        System.out.printf("Summary of values equal to %d\n" +
                        "Average value is %d\n", sum, ((int) (counter / 2)));

    }

}
