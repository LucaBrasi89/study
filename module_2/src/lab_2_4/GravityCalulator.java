package lab_2_4;

/**
 * Created by andrew on 07.02.17.
 */

/*=====Laboratory work 2.4.7=====*/

/* Write a program that computes the distance an object will fall in Earth's
gravity. Create a new class called GravityCalculator with method calcDist(double
time) that takes double time, and returns the position of an object after
falling for time seconds(outputting the position in meters). The formula in Math
 notation is:
        x(t) = 0.5 × a × time 2 + v i × time + x i
        Where:
        a - Acceleration (m/s 2 ) = -9.81
        t - Time (s) (for example t = 10)
        v i - Initial velocity (m/s) = 0
        x i - Initial position = 0
        Declare acceleration value field as a constant
*/

public class GravityCalulator {

    private static final double acceleration = (-9.81);

    public static double calcDist(double time) {

        double pos = 0.5*acceleration*(Math.pow(time,2));

        System.out.printf("The position of object is %.2f meters after %.2f secs in " +
                "falling state\n", pos, time);
        return pos;

    }


}
