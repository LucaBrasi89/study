package lab_1_9;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        02.06.17
 */
public class CalculateBitwiseImpl implements CalculateBitwise {


    @Override
    public int andBitwise(int elem, int elem2) {

        return (elem & elem2);
    }

    @Override
    public int orBitwise(int elem, int elem2) {

        return (elem | elem2);
    }

}
