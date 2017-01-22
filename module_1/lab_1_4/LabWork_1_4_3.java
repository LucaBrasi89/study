package module_1.lab_1_4;

/**
 * Created by andrew on 17.01.17.
 *
 * TASK:
 *
 *   Write a console program that prints result of each of arithmetic
 *   logical (AND, OR, NOT, XOR) for two variables of boolean data type.
 */

public class LabWork_1_4_3 {

    public static void main(String[] args) {

        boolean trueVar = true;
        boolean falseVar = false;

        if ( trueVar == true && falseVar == false) {

            System.out.println("вывдеет это сообщения, т.к. оба условия выполняются\n\n");
        }



        if ( trueVar != true  || falseVar != false) {


        }

        else {

            System.out.println("мы в ветке else, т.к. оба условия ложны\n\n");
        }

        if ( trueVar != false ) {

            System.out.println("и вот, trueVar не равно false!\n\n");
        }

        if ( trueVar  ^ falseVar ) {

            System.out.println("true, ибо обо trueVar и falseVar разные\n\n");

        }

    }
}
