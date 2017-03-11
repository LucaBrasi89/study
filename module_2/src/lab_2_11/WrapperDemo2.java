package lab_2_11;

/**
 * Created by andrew on 05.03.17.
 */
/*        Open project WrapperDemo2 (from 2.10 lab).
        Add to class Main assertions code that checks correct result of executing compute( , )
        method. The compute( , ) method use as argument s two different numeric wrapper
        classes, adds the values of the two instances together, and then creates a third numeric
        wrapper instance whose value is the sum and return it.
        In method main() write code to invoke compute(,) in assertion and compare to correct
        result.
*/

//  ========  Lab Work 2-11-5   ========

public class WrapperDemo2 {

    public static int compute(Byte val1, Integer val2) {

        Long val3 = Long.valueOf(val1 + val2);

        return 0;

    }

    public static void main(String[] args) {

        Byte b1 = 26;
        Integer i1 = 10000;

        Integer third = b1 + i1;

        assert (WrapperDemo2.compute(b1,i1) == third);



    }

}
