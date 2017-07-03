package multithreading;

/**
 * Created by andrew on 26.03.17.
 */
public class MyThread4 extends Thread {

    @Override
    public void run() {

        int res;
        for (int i = 0; i < 1_000_000; i++) {
            res= i*i/2;
        }
        System.out.println("MyThread4 have finished");

    }

}
