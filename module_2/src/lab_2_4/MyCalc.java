package module_2.src.lab_2_4;

/**
 * Created by andrew on 06.02.17.
 */

/*    =====Laboratory work 2.4.5=====

 Посчитать число PI до n знака переданного в качестве аргумента в
 метод calcPi.
*/


public class MyCalc {


    public static void calcPi(int n) {

        boolean odd = true;
        double result = 0;
        double divider = -1;
        /* более менее внятная точность начинаеть аж на милионной итерации */
        int actions = 1_000_000;
        for (int i = 0; i < actions; i++) {

            divider += 2;
            if (odd) {
                result += (4 / divider);
                odd = false;
            } else {
                result -= (4 / divider);
                odd = true;
            }

        }

        String pi = Double.toString(result);

        System.out.println(pi.substring(0, (n + 2)));


    }

}
