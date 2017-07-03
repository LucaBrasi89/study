package lab_2_14.TestGenerics3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        24.03.17
 */

/*
     Create new project called TestGenerics3.
    Add package “com.brainacad.oop.testgenerics3”.
    1) Create a generic class MyMixer<T> with field as array of some type, provide
    constructor with one parameters. Add to MyMixer public shuffle() method which
    shuffle elements of array and return it;
    2) Create a class Main with a main() method. Add to method main() code that creates
    two array of different types:
    First one is array of Integer with values {1,2,3,4,5,6,7,8,9}
    Second one is array of String: {“one”,”two”, ...}
    3) Create two objects of MyMixer type and using each of arrays, invoke shuffle() method
    and print result to console.
    4) Execute the program.
    Example of program output:
 */



public class MyMixer<T> {

    public MyMixer(ArrayList<T> arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "MyMixer{" +
                "arr=" + arr +
                '}';
    }

    private ArrayList<T> arr = new ArrayList<T>();

    public ArrayList<T> shuffle() {
        Collections.shuffle(arr);

        return (arr);
    }


}
