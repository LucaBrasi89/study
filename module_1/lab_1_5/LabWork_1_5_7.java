package module_1.lab_1_5;

import java.util.Scanner;

/**
 * Created by andrew on 24.01.17.
 */

    /*TASK:

        Write a program that find and displays all perfect numbers
        from 1 to n (perfect number is a positive integer that is equal to
        the sum of its proper positive divisors, excluding the number itself).*/


public class LabWork_1_5_7 {

    public static void main(String[] args) {

        System.out.println("Enter upper limit value:\n\n");
        //        читаем поток ввода с клавы
        Scanner sc = new Scanner(System.in);
        int upperLimit; //максимальное число диапазона, получено с клавы
        int perfNumberCount = 0; //счетчик для perfect numbers

        upperLimit = sc.nextInt();

        for (int currNumber = 1; currNumber <= upperLimit; currNumber++) {

            int perfNumbSum = 0;
            for (int division = 1; division < currNumber; division++) {
                if (currNumber % division == 0) {

                    perfNumbSum = perfNumbSum + division;

                }
                if (perfNumbSum == currNumber && ((division + 1) == currNumber)) {
                    perfNumberCount++;
                    System.out.printf("%2dth - %d %n", perfNumberCount, currNumber);

                }
            }

        }
    }

}
