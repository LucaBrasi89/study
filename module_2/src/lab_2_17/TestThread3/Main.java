package lab_2_17.TestThread3;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        17.04.17
 */
public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();

        Counter cnt = new Counter(storage);
        Thread myThr1 = new Thread(cnt);

        Printer prnt = new Printer(storage);
        Thread myThr2 = new Thread(prnt);

        myThr1.start();
        myThr2.start();


    }


}
