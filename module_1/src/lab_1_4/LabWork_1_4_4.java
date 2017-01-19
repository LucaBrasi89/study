package lab_1_4;

/**
 * Created by andrew on 17.01.17.
 *
 *   TASK:
 *
 *      Write a console program that prints result of increment and decrement
 *      in prefix and postfix mode for integer variable.
 *
 */
public class LabWork_1_4_4 {

    public static void main(String[] args) {

        int iVal1 = 10;
        int iVal2 = 10;

        System.out.println("пусть это будет префиксный инкремент " + (++iVal1) );
        System.out.println("пусть это будет постификсный инкремент " + (iVal2++) );
        System.out.println("iVal1 =  " + (iVal1));
        System.out.println("iVal2 =  " + (iVal2));
        System.out.println("а теперь седлай мне вывод --iVal + 1  = " + (--iVal1 + 1));
        System.out.println("а теперь седлай мне вывод iVal-- + 1 = " + (iVal2-- + 1));
        System.out.println("iVal1 =  " + (iVal1));
        System.out.println("iVal2 =  " + (iVal2));

    }


}
