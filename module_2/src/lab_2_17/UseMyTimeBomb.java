package lab_2_17;

import java.util.Random;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        15.04.17
 *
 *  TASK: 2.17.3
 */
public class UseMyTimeBomb {

    public static void main(String[] args) {
        //        Task:   2.17.3

        int[] myArray = new int[1000];
        Random rand = new Random();

//        Fill arrays with random values
        for (int i = 0; i < 1000; i++) {

            myArray[i] = rand.nextInt(1000);
        }

        MySumCount mySum1 = new MySumCount(0, 500, myArray);
        MySumCount mySum2 = new MySumCount(500, 1000, myArray);
        mySum1.start();
        mySum2.start();
        System.out.println("Result of sum is: " + mySum1.getResultSum() + mySum2.getResultSum());

    }

}
