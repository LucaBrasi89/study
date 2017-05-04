package lab_1_7.TestLambda1;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        04.05.17
 */
/*
    Open project called TestLambda1 (from 1-7-2 lab).
            1) Add a MyConverter functional interface that contains an convertStr(String str) abstract
    method to convert a string to uppercase and a isNull(String str) static method to check
            the string to null.
            2) Add in a Main class a updateList() static method, which converts the strings of list to
            uppercases.
            3) Add in a main() method code that invokes updateList() method and output the result.
*/


public interface MyConverter {

    String convertStr(String str);

    public static boolean isNull(String str) {

        if (str == null) {
            return true;
        } else {
            return false;
        }
    }

}
