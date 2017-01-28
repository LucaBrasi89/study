package module_1.lab_1_5;

import java.util.Scanner;

/**
 * Created by andrew on 21.01.17.
 */

//вариант исполнениея условий со switch

public class LabWork_1_5_2_switch_release {

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
            switch (inputVal) {

                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("other");
                    break;

            }


        }

    }

}
