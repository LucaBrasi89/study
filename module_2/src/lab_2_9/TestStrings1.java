package lab_2_9;

/**
 * Created by andrew on 04.03.17.
 */
public class TestStrings1 {

    static void reverseString(String str) {

        StringBuffer reverseStr = new StringBuffer(str);
        System.out.println(reverseStr.reverse());


    }

    public static void main(String[] args) {

        String myStr = "abracadabra";
        int firstPos = myStr.indexOf("ra");
        System.out.println(firstPos);
        int lastPos = myStr.lastIndexOf("ra");
        System.out.println(lastPos);
        String subStr1 = myStr.substring(3,7);
        System.out.println(subStr1);
        TestStrings1.reverseString("abcd");


    }

}
