package lab_2_17;

import java.util.Arrays;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        11.04.17
 * <p>
 * Task 2.15.4
 */
public class MySumCount2 implements Runnable {


    private int startIndex;
    private int stopIndex;
    private long resultSum = 0;
    private int[] arr;

    public MySumCount2(int startIndex, int stopIndex, int[] arr) {

        this.arr = Arrays.copyOf(arr, arr.length);
        setStartIndex(startIndex);
        setStopIndex(stopIndex);

    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public long getResultSum() {
        return resultSum;
    }


    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }


    @Override
    public void run() {


        for (int i = startIndex; i < stopIndex; i++) {


            resultSum = resultSum + arr[i];

        }


    }
}
