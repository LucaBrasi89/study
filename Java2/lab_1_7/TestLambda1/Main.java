package lab_1_7.TestLambda1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Created by andrew on 30.04.17.
 * <p>
 * Lab Work 1-7-2
 * <p>
 * Open project called TestLambda1 (from 1-7-1 lab).
 * 1) Add in a Main class a sumEven() static method that takes two parameters: the first - an
 * array of integers, and the second - the predicate of Predicate<Integer> type for
 * selecting numbers.
 * 2) Add in a main() method code that invokes sumEven() method and in the form of a
 * lambda expression specifies the selection condition the values of the array elements.
 * 3) Add in a Main class a printJStr() static method that takes two parameters: the first - an
 * list of strings, and the second - the predicate of Predicate<String> type for the
 * selection of strings beginning with a given letter.
 * 4) Add in a main() method code that invokes printJStr() method and in the form of a
 * lambda expression specifies the selection condition the strings.
 */
public class Main {


    private static int[] arrInt = {5, 10, 21, 33, 43, 46, 98, 120, 188, 464, 512, 721};
    private static List<String> strings = Arrays.asList("Alice", "Jacob", "Bob", "Ronnie",
            "Martin", "Barbara", "Joda", "Jane");

    public static void main(String[] args) {

        //        для интов
//        yes, it can be shorter, but i just want to write multiline lambda
        sumEven(arrInt, elem -> {
            if ((elem % 2) == 0) {
                return true;
            }
            return false;
        });

        System.out.println(" - - - - - - - ");
        printJStr(strings, (elem) -> (elem == Character.getNumericValue('J')) );
    }

    public static void sumEven(int[] arrInt, Predicate<Integer> prdct) {

        int sum = 0;
        for (int elem : arrInt) {
            if (prdct.test(elem)) {
                sum += elem;
            }
        }
        System.out.println("this is total sum " + sum);

    }

    public static void printJStr(List<String> strings, Predicate<Integer> prdct) {

        char ch;
        for (String word : strings) {

            ch = word.charAt(0);
            if (prdct.test(Character.getNumericValue(ch)) ) {
                System.out.print(" " + word);
            }

        }


    }


}
