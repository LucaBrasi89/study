package lab_2_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        11.04.17
 */
public class Main {

    public static void main(String[] args) {

/*
        Task:   2.17.1

        MyTimeBomb bomb1 = new MyTimeBomb();
        bomb1.start();
*/

/*
        Task:   2.17.2

        MyTimeBomb2 bomb2 = new MyTimeBomb2();
        Thread th1 = new Thread(bomb2);
        th1.start();
*/

//        Task:   2.17.3

        int[] myArray =  new int[1000];
        Random rand = new Random();

//        Fill arrays with random values
        for (int i = 0; i < 1000 ; i++) {

            myArray[i] = rand.nextInt(1000);
        }


        MySumCount mySum1 = new MySumCount(0,500, myArray);
        MySumCount mySum2 = new MySumCount(500,1000, myArray);
        mySum1.start();
        mySum2.start();
        System.out.println("Result of sum is: " + mySum1.getResultSum() + mySum2.getResultSum());

    }

}
