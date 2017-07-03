package lab_2_17.TestThread3;

import java.util.*;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.04.17
 */

public class Storage {

    private boolean state = true;
    private boolean isFull = false;
    public Deque<Integer> storage = new ArrayDeque<>();


    public synchronized void addElem (int elem) {

        while (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        state = false;
        storage.addLast(elem);
        notifyAll();

    }

    public synchronized int getLastElem() {

        while (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        state = true;

        notifyAll();
        return storage.getLast();

    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
