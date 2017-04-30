package lab_1_7.TestLambda1;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

/**
 *
 * Created by andrew on 30.04.17.

                        Lab Work 1-7-2

     Open project called TestLambda1 (from 1-7-1 lab).
     1) Add in a Main class a sumEven() static method that takes two parameters: the first - an
     array of integers, and the second - the predicate of Predicate<Integer> type for
     selecting numbers.
     2) Add in a main() method code that invokes sumEven() method and in the form of a
     lambda expression specifies the selection condition the values of the array elements.
     3) Add in a Main class a printJStr() static method that takes two parameters: the first - an
     list of strings, and the second - the predicate of Predicate<String> type for the
     selection of strings beginning with a given letter.
     4) Add in a main() method code that invokes printJStr() method and in the form of a
     lambda expression specifies the selection condition the strings.

 */
public class Main {


    public static Integer[] arrInt = new Integer[20];
    public static void main(String[] args) {

        //        для интов

        Random rand = new Random();
        for (int i = 0; i < (arrInt.length); i++) {
            arrInt[i] = rand.nextInt(1000);
        }

        Arrays.sort(arrInt, (a, b) -> ( a - b));
        for (Integer elem : arrInt ) {

            System.out.print(elem + "   ");

        }

    }

    public static void sumEven(Integer[] arrInt, (Predicate pr) ->
    {


        if(( % 2) == 0){
        return true;
    })



    }



}
