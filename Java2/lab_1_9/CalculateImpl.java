package lab_1_9;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        01.06.17
 */
public class CalculateImpl implements Calculate {


    @Override
    public int multiplication(int multiplier, int multiplicand) {

        return (multiplier * multiplicand);
    }

    @Override
    public double division(int dividend, int divisor) {

        return (dividend / divisor);
    }
}
