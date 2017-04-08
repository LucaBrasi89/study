package multithreading;

/**
 * Created by andrew on 26.03.17.
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {

        int res;
        for (int i = 0; i < 1_000_000; i++) {
            res= (int) Math.sqrt((double)i) + i;
        }
        System.out.println("MyThread2 have finished");

    }

}
