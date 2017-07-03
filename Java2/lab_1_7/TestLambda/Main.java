package lab_1_7.TestLambda;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by andrew on 30.04.17.
 * <p>
 * Lab Work 1.7.1
 */
public class Main {

    public static void main(String[] args) {


//        для интов
        Integer[] arrInt = new Integer[20];
        Random rand = new Random();
        for (int i = 0; i < (arrInt.length); i++) {
            arrInt[i] = rand.nextInt(1000);
        }

        Arrays.sort(arrInt, (a, b) -> ( a - b));
        for (Integer elem : arrInt ) {

            System.out.print(elem + "   ");

        }

//        для стрингов
        List<String> list = new ArrayList<String>();
        list.add("Andrew");
        list.add("Kate");
        list.add("Pablo");
        list.add("John");
        list.add("Mary");
        list.add("Ann");
        list.add("William");

        Collections.sort(list, (String a, String b) -> (a.charAt(0) - b
                .charAt(0)));

        System.out.println();
        System.out.println();
        for (String elem : list) {
            System.out.print(elem + "  ");
        }

    }


}
