package lab_2_15.test_collection3;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        31.03.17
 */

/*

    Create a class Main with a main() method. Add to method main() code to create both an
    ArrayList and LinkedList (of String parameter type), and fill each in loop with string
    values like: “num_” and number of current iteration (from 0 to 10).
    Print each list using an ordinary Iterator. Then insert one list (ArrayList) into the other
    (LinkedList) by using an ListIterator, inserting at every other location.
    Now perform the insertion elements of the first list in reverse order, moving through the
    element from end to beginning in the second list.
    Write a static method printElements() that uses an Iterator to step through an Collection
    and print the each element value in the container.
    Execute the program.

* */


public class Main {

    public static void main(String[] args) {

//        создали два списка
        List<String> arrList = new ArrayList<String>();
        List<String> linkList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add("number_" + i);
            linkList.add("number_" + i);
        }

        Iterator i1 = arrList.iterator();
        Iterator i2 = linkList.iterator();
        System.out.println("исходные значения списков");
        while (i1.hasNext()) {
            System.out.print(i1.next() + "       ");
            System.out.println(i2.next());
        }

//        добавили один в другой

        ListIterator listIter1 = arrList.listIterator();
        List tempList;
        tempList = new LinkedList(linkList);
        Collections.reverse(tempList);
        ListIterator listIter2 = tempList.listIterator();
        while (listIter1.hasNext()) {

            listIter1.next();
            listIter1.set(listIter2.next());
        }

//        окончательная печать значений

        Main.printElements(linkList, arrList);
    }

    public static void printElements(List elem1 , List elem2) {

        Iterator i1 = elem1.iterator();
        Iterator i2 = elem2.iterator();
        System.out.println("\n\nвывод пребразованных списков");
        while (i1.hasNext()) {
            System.out.print(i1.next() + "       ");
            System.out.println(i2.next());
        }

    }
}
