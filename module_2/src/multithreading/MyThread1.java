package multithreading;

/**
 * Created by andrew on 26.03.17.
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {

        int res;
        for (int i = 0; i < 1_000_000; i++) {
            res= (int) Math.sqrt((double)i);
        }
        System.out.println("MyThread1 have finished");

    }

}
