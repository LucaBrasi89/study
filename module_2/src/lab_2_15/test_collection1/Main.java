package lab_2_15.test_collection1;

import java.awt.*;
import java.util.*;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        31.03.17
 */

/*

     Create new project called TestCollection1.
    Add package “com.brainacad.oop.testcollection1”.
    Create a class Main with a main() method. Add to method main() code that declares list
    variable (of List type) of string objects as ArrayList<String>.
    Write code to fill this list in loop with string values like: “number_” and number of
    current iteration (from 0 to 10). Add code which iterates over list and print current
    element value to console.
    Execute the program.

    The program output must be like next example:
    number_0
    number_1
    number_2
    ...
    number_9

* */


public class Main {

    public static void main(String[] args) {

        java.util.List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("number_" + i);
        }
        System.out.println(list);
    }
}
