package module_1.lab_1_4;

/**
 * Created by andrew on 20.01.17.
 *
 * Write a console program that prints result of Ternary operator for integer
 * variable initialization.
 *
 *
 */
public class LabWork_1_4_7 {

    public static void main(String[] args) {

        int iVal1 = 10;
        int iVal2 = 100;
        int iVal3;
        boolean bVal1 = true;
        boolean bVal2 = true;


        iVal3 = (bVal1 == true) ? iVal1 : iVal2 ;

        System.out.println("This result should be equal to ... " + iVal3 + "\n\n\n");

        iVal3 = (bVal1 == false) ? iVal1 : iVal2 ;
        System.out.println("This result should be equal to ... " + iVal3);


    }
}
