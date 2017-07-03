package lab_2_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrew on 05.03.17.
 */
public class TestStrings5 {

    public static void checkPersonWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[A-Z][a-z]+");
        Matcher m = p.matcher(userNameString);
        if (m.matches() == true) {

            System.out.println(userNameString);
        }
    }

    public static void main(String[] args) {

        String[] myStrArr = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd",
        "TomCat",""};
        for (String str : myStrArr ) {
            checkPersonWithRegExp(str);
        }

    }

}
