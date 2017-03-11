package lab_2_11;

/* 3) Define an MyTest object reference and initialize it to null. Try to
call a method through this reference. Now wrap the code in a try-catch clause
        to catch the exception.*/

/**
 * Created by andrew on 11.03.17.
 */
public class MyTest_3 {

    public static void main(String[] args) throws MyException {

        MyTest_3 obj1 = null;
        obj1.test();


    }

    public static void test() throws MyException {

        throw new MyException("Exception");

    }

}
