package lab_2_9;

import java.util.StringTokenizer;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        04.03.17
 */
public class TestString4 {

    public static void main(String[] args) {

        String myString = "String myStr = “This is String, split by StringTokenizer." +
                " Created by Student:\n" +
                "Andrew Sotnikov";

        StringTokenizer myStrTokinzer = new StringTokenizer(myString, "., ");
        while (myStrTokinzer.hasMoreElements()) {

            System.out.println(myStrTokinzer.nextToken());
        }
    }
}
