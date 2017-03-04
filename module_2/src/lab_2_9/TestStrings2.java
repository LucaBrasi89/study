package lab_2_9;

/**
 * Created by andrew on 04.03.17.
 */
public class TestStrings2 {

    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        boolean uniqueSymb = false;

        for (int i = 0; i < myStr1.length(); i++) {

            if (myStr2.indexOf(myStr1.charAt(i)) == -1) {

                System.out.println(myStr1.charAt(i));
            }
        }
    }
}

