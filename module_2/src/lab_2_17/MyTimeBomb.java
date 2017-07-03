package lab_2_17;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        11.04.17
 *
 *  ====== TASK: 2.17.1 ======
 *
 */
public class MyTimeBomb extends Thread {

    @Override
    public void run() {

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!");
    }
}
