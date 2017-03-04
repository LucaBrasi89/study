package lab_2_9;

import java.util.Arrays;

/**
 * Created by andrew on 04.03.17.
 */
public class TestStrings3 {

    static String uniqueChars(String str){

        char[] uniqueChars = new char[0];
        for (int i = 0; i < str.length() ; i++) {

            int count = 0;
            char curChar = str.charAt(i);
            if ( str.indexOf() > 1 ) {

                uniqueChars = Arrays.copyOf(uniqueChars, uniqueChars.length
                        +1);
                uniqueChars[uniqueChars.length -1]  = curChar;

            }

        }


    }

    public static void main(String[] args) {


    }

}
