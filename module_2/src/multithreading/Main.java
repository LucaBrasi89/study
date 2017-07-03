package multithreading;

/**
 * Created by andrew on 26.03.17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        MyThread3 th3 = new MyThread3();
        MyThread4 th4 = new MyThread4();

        th1.start();
        th1.join();
        th2.start();
        th2.join();
        th3.start();
        th3.join();
        th4.start();
        th4.join();
        System.out.println("I an waiting for other threads");


    }

}
