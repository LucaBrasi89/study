package lab_1_12;

/**
 * Created by andrew on 18.06.17.
 */
public class Main {


    static MyObj objRef = null;
    public static void main(String[] args) throws InterruptedException {

        objRef = new MyObj(9185);
        objRef = null;
        System.out.println("Test1 " + objRef);
        System.gc();
        Thread.sleep(1000);
        System.out.println("objRef =" + objRef);
        System.out.println("Test2 " + objRef);
        System.gc();
        Thread.sleep(1000);
        System.out.println("objRef =" + objRef);


    }


}
