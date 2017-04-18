package lab_2_17.TestThread3;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.04.17
 */
public class Counter implements Runnable {

    private Storage storage;

    public Counter(Storage storage) {

        this.storage = storage;
    }

    @Override
    public void run() {

            for (int i = 1; i < 1_000_000; i++) {

                storage.addElem(i);

            }
            storage.setFull(true);


        }
    }



