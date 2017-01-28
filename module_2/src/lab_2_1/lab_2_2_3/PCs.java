package lab_2_1.lab_2_2_3;

import lab_2_1.lab_2_2_1.Computer;

/**
 * Created by andrew on 28.01.17.
 */

/*    TASK:

            Write a program to create array of Computer objects (5 pcs.).
            Declare array of Computer objects (5 pcs.), create 5 Computer
            objects and place it to array (using loop).*/


public class PCs {

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        for (int i = 0; i < 5; i++) {

            computers[i] = new Computer();
            computers[i].setFrequencyCPU(2000);
            computers[i].setManufacturer("ASUS");

        for (Computer computer : computers) {

            computer.setPrice(1000);

            int i1 = 05C;



        }

    }

}
