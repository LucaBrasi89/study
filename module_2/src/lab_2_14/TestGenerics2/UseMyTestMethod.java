package lab_2_14.TestGenerics2;

import java.util.Random;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        23.03.17
 */


/*

 * Lab2-14-2
 * Add package “com.brainacad.oop.testgenerics2”.
 * 1) Create class MyTestMethod with generic static method calcNum (with two parameters: an array T[]
 * and variable maxElem of type T) that counts the number of elements in an array T[] that are greater
 * than a specified element maxElem.
 * 2) Create a class Main with a main() method. Add to method main() code that creates two array,
 * first – array of Integer type and second – array of Double type. Fill these arrays with some random values.
 * Add code to counts the number of elements in each of arrays that are greater than a specified element
 * by invoking calcNum() static method.
 * 3) Execute the program.
 * The program output must be like next example:
 * Array values: [1,2,3,4,5,6,7,8,9]
 * Number of elements that are greater than 3:
 * 6
 * Array values: [1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9]
 * Number of elements that are greater than 3:
 * 7*
 *
 * */


public class UseMyTestMethod {

    public static void main(String[] args) {

        System.out.println("\n----- Lab 2.14.2 -----");
//        нагеним рандомов
        Random rand = new Random();
//        массив интов
        Integer[] intArr = new Integer[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(100);
        }
        System.out.println("\nArray of integers");
        MyTestMethod.<Integer>calcNum(intArr, 20);
//        массив даблов
        Double[] doubleArr = new Double[10];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = (rand.nextInt(100))*1.123;
        }
        System.out.println("\nArray of Doubles");
        MyTestMethod.<Double>calcNum(doubleArr,  20.00);

        System.out.println("\n----- Lab 2.14.3 -----");
        System.out.println("\nArray of integers");
        MyTestMethod.<Integer>calcSum(intArr, 12);
        System.out.println();
        System.out.println("\nArray of Doubles");
        MyTestMethod.<Double>calcSum(doubleArr, 15.00);


    }

}
