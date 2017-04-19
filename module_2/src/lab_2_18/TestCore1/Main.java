package lab_2_18.TestCore1;

import java.math.BigInteger;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        19.04.17
 * <p>
 * Lab Work 2-18-1
 * <p>
 * Create new project called TestCore1. Add package “com.brainacad.oop.testcore1”.
 * Write program which calculates the factorial of N, where N is set at random in the range
 * of 10 to 50 (use BigInteger to get the result).
 */


public class Main {

    public static BigInteger factorial(int N) {

        BigInteger factorial = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= N; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));

        }
        return factorial;
    }

    public static void main(String[] args) {

        System.out.println("This is result of factorial: \n\t\t" + Main.factorial(34));

    }
}
