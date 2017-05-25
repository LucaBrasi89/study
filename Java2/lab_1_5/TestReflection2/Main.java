package lab_1_5.TestReflection2;

import java.lang.reflect.Field;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        24.05.17
 */

/*
                            Lab Work 1-5-2

        1) Add to method main() code that declares local variable myStr of String type with
        “abcd” value. Write code to get access and change values (using reflection) of private
        field “char value[]”, which is used for character storage. The new values set to [z,x,c,v].
        2) Add code to print this string before and after private field values modification to
        console.
        3) Then add next code: System.out.println(“abcd”);
        4) Execute the program.
*/



public class Main {

    public static void main(String[] args) {

        String myStr = new String("abcd");
        System.out.println("this is myStr: " + myStr + "\n");
        for (Field field : myStr.getClass().getDeclaredFields()) {
            System.out.println(field);
        }
//        Field privateField = myStr.getClass().getDeclaredField("value");
        System.out.println("this is myStr: " + myStr);

    }
}
