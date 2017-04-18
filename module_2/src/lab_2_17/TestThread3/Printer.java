package lab_2_17.TestThread3;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.04.17
 */
public class Printer implements Runnable {

    private Storage storage;

    public Printer(Storage storage) {

        this.storage = storage;
    }


    @Override
    public void run() {

        while (!(storage.isFull())) {
            System.out.println(storage.getLastElem());

        }
    }

}

