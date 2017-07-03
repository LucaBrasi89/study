package module_1.lab_1_4;

/**
 * Created by andrew on 20.01.17.
 *
 *
 * TASK:
 *
 * Write a console program that prints result type casting for different
 * primitive types.
 *
 *  1. Student should declare and initialize several primitive variables
 *   and try to cast to another primitive type variable.
 *
 *  2. Student should use one System.out.println(...) statement for each line
 *   of outputs.
 *
 *
 *
 */
public class LabWork_1_4_8 {

    public static void main(String[] args) {

        double cVal = 1234.1290;
        int iVal = (int) cVal;
        double dVal = 10;

        /*хрен что вышло. Странно, почему бы не преобразовать 10 в true?
        boolean boolVal = (boolean) 10;*/

        byte byteVal = (byte)  cVal;
        char charVal = (char)  cVal;

        System.out.println(" double   => int      " + iVal + "\n");
        System.out.println(" int      => double   " + dVal+ "\n");
        System.out.println(" double   => byte     " + byteVal+ "\n");
        System.out.println(" double   => char     " + charVal);
        System.out.println(" Конвертнем значение char'a, а то какой-то гавняный " +
                "символ высветился... " + (int) charVal);


    }
}
