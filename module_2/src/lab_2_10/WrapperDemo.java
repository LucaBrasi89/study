package lab_2_10;

/**
 * Created by andrew on 05.03.17.
 */

//  ========  Lab Work 2-10-1   ========

public class WrapperDemo {

    public static void main(String[] args) {

        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10");

        System.out.println((x1 == x2));
        System.out.println((x4 == x5));

        System.out.println("--------");
        x1 = 128;
        x2 = 128;
        x4 = 128;
        x5 = 128;

        System.out.println((x1 == x2));
        System.out.println((x4 == x5));
        System.out.println("--------");

        Integer x6 = 10;
        Integer x8 = new Integer(10);
        Integer x9 = Integer.valueOf(10);
        Integer x10 = Integer.parseInt("10");

        System.out.println((x6.equals(x8)));
        System.out.println((x9.equals(x10)));

    }


}
