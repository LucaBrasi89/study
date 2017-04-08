package lab_2_15.TestMyGenerator;

import java.util.*;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        01.04.17
 */

/*

        Task to 2.15.4:

        1) Create class MyNumGenerator with two fields: numOfElm and maxNumb of int type,
        constructor with two parameters and method generate() which return new collection
        (of List type) with numOfElm length, filled with numbers from 0 to maxNumb .
        2) Create a class Main with a main() method. Add to method main() code to create
        instance of MyNumGenerator (for example with 5, 64 parameters) and print result of
        invoking generate() method to console.
        3) Execute the program.
        The program output must be like next example:
        [43,15,60,2,5]


        Task to 2.15.4:

        Open project called TestMyGenerator.
        1) Add to class MyNumGenerator new method generateDistinct() which return new
        collection (of Set type) with numOfElm length and filled with distinct (with no
        duplicate values) numbers (which generated randomly) from 0 to maxNumb.
        2) Create a class Main with a main() method. Add to method main() code to create
        instance of MyNumGenerator (for example with 5,64 parameters) and print result of
        invoking generateDistinct() method to console.
        3) Execute the program.
        The program output must be like next example:
        [5,61,47,2,17]

*/

class MyNumGenerator {

    private int numOfElem;
    private int maxNumb;

    public MyNumGenerator(int numOfElem, int maxNumb) {

        this.maxNumb = maxNumb;
        this.numOfElem = numOfElem;

    }
    
    public List generate() {

        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < numOfElem ; i++) {
            list.add(rand.nextInt(maxNumb));
        }
        return list;
    }


    public Set generateDistinct() {

        Set<Integer> list = new LinkedHashSet<>();
        Random rand = new Random();
        for (int i = 0; i < numOfElem ; i++) {
            list.add(rand.nextInt(maxNumb));
        }
        return list;
    }



}
