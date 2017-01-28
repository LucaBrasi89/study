package module_1.lab_1_5;

import java.util.Scanner;

/**
 * Created by andrew on 21.01.17.
 */

//вариант исполнениея условий с if-else-if

public class LabWork_1_5_2_ifElseIf_release {

    public static void main(String[] args) {

//        читаем поток ввода с клавы. Чтобы прервать поток - напиши 0

        Scanner sc = new Scanner(System.in);
        int inputVal;
        while (true) {

             inputVal = sc.nextInt();
//             если надоело играться, прерви-ка поток
             if (inputVal == 0) {
                 break;
             }

//             проверим, в какую категорию попадает наш случай
            if (inputVal == 1) {
                System.out.println("One");
            } else if ( inputVal == 2) {
                System.out.println("Two");
            } else if ( inputVal == 3) {
                System.out.println("Three");
            } else if ( inputVal == 4) {
                System.out.println("Four");
            } else if ( inputVal == 5) {
                System.out.println("Five");
            } else if ( inputVal == 6) {
                System.out.println("Six");
            } else if ( inputVal == 7) {
                System.out.println("Seven");
            } else if ( inputVal == 8) {
                System.out.println("Eight");
            } else if ( inputVal == 9) {
                System.out.println("Nine");
            }
            else {
                System.out.println("other");
            }








        }






    }

}
