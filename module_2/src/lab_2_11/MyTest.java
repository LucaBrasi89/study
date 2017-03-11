package lab_2_11;

/* 1) Create your own exception class MyException using the extends keyword.
        Write a constructor for this class that takes a String argument and
        stores it inside the object with a String reference. Write a method
        that prints out the stored string. Add to method main() a try-catch
        clause to exercise your new exception.*/

/**
 * Created by andrew on 11.03.17.
 */


public class MyTest {

    public static void main(String[] args) {
        try {
        throw new MyException("damn. Another exception");
        } catch (MyException e) {
            e.printMessage();
        }
    }
}
