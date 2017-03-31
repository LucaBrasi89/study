package lab_2_15.test_collection2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        31.03.17
 */

/*

    Create a class Main with a main() method. Add to method main() code that declares list
    variable (of List type) of string objects as LinkedList<String>.
    Write code to fill this list in loop with string values like: “num_” and number of current
    iteration (from 0 to 10). But element insertion point must be generated randomly (from
    0 to current collection length).
    Add code which iterates over list and print current element value to console.
    Execute the program.
    The program output must be like next example:
    number_5
    number_2
    number_7
    ...
    number_3

* */


public class Main {

    public static void main(String[] args) {

        java.util.List<String> list = new ArrayList<String>();
        int insertionInd;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (list.size() == 0) {
                list.add("number_" + i);
            }
            else {
                insertionInd = random.nextInt(list.size());
                list.add(insertionInd,"number_" + i);
            }
        }
        System.out.println(list);
    }
}
