package lab_2_5;

import java.lang.reflect.Array;
import java.util.Arrays;


 /* Lab work 2.5.1 и Lab work 2.5.2
 *
 * Создание полей static и non-static, также двух конструкторов.
 * Генерация случайных чисел для массива arr.
 *
 * */



/**
 * Created by andrew on 05.02.17.
 */
public class MyInitTest {

    private int[] arr = new int[10];

    static {
        System.out.println("Static initialization block 1");
        System.out.println("Static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
        System.out.println("nons-static initialization block 2");
    }

    {
        for (int i = 0; i < arr.length ; i++) {

            arr[i] = (int) (Math.random() * 100);

        }
    }

    public MyInitTest() {

        this(2);
        System.out.println("constructor 1");

    }

    public MyInitTest(int val) {


        System.out.println("constructor 2");
    }

    public void printArray() {

        System.out.println(Arrays.toString(arr));

    }




}
