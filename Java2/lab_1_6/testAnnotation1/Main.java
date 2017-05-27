package lab_1_6;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by andrew on 21.05.17.
 */
public class Main {

//    @Deprecated
//    @SuppressWarnings("deprecation")

//    @SafeVarargs
//    public static int findMax(int... arr) {
//
//        System.out.println("I am simple");
//        Arrays.sort(arr);
//        return arr[arr.length -1];
//
//    }


    @SafeVarargs
    private static <T> T findMax(T... arr) {

        System.out.println("I am use generics");
        Arrays.sort(arr);
        return arr[arr.length -1];

    }

    public static void main(String[] args) {

        int[] arr = {1,15,22,40,11,15};
//        System.out.println(Main.findMax(arr));
        System.out.println(Main.findMax(1,91,2214,14,22));

    }

}
