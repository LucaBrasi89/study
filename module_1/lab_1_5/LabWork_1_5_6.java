package module_1.lab_1_5;

import java.util.Scanner;

/**
 * Created by andrew on 21.01.17.
 */

/*Читать значения с клавы в поток. Вывести сумму квадратов считанных значений*/


public class LabWork_1_5_6 {

    public static void main(String[] args) {

        //        читаем поток ввода с клавы. Чтобы прервать поток - напиши 0

        Scanner sc = new Scanner(System.in);
        int inputVal;
        int sumOfSquares = 0;
        String result = "";

        while (true) {

            inputVal = sc.nextInt();
//             если надоело играться, прерви-ка поток
            if (inputVal == 0) {
                break;

//            формируем читабельное поясенение к вычислению
            }
            if (result == "") {
                result = inputVal + "^2";
            } else {
                result = result + " +  " + inputVal + "^2";
            }

//            подсчитаем суммы квадратов
            sumOfSquares = sumOfSquares + (inputVal*inputVal);




        }
        System.out.print(result);
        System.out.print(" = "+sumOfSquares);

    }

}



