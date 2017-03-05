package lab_2_10;

/**
 * Created by andrew on 05.03.17.
 */

//  ========  Lab Work 2-10-2   ========

public class WrapperDemo2 {

    public static Long compute(Byte val1, Integer val2) {

        Long val3 = Long.valueOf(val1 + val2);

        return val3;

    }

    public static void main(String[] args) {

        Byte b1 = 26;
        Integer i1 = 10000;
        System.out.println(WrapperDemo2.compute(b1, i1));

    }

}
