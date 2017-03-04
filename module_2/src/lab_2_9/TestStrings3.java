package lab_2_9;

import example.testpack.Main;

import java.util.Arrays;

/**
 * Created by andrew on 04.03.17.

             ============ Lab work 2.9.3 ============
 Create static method: uniqueChars(String s), which must take a String as argument and
 return an array of distinct (unique) chars (char[]) of the given string.
 In method main() add code to invoke uniqueChars() method and pass string: “Using
 methods of class String” as argument. Print result to console.
 Execute the program.
 */

public class TestStrings3 {


    private static char[] uniqueChars; // массив уникальных символов

    public static void uniqueChars(String str) {

        uniqueChars = new char[0];
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
//            если массив пустой молча добавим туда пустой символ. Иначе схватим error
            if (uniqueChars.length == 0) {
                uniqueChars = Arrays.copyOf(uniqueChars, uniqueChars.length + 1);
                uniqueChars[uniqueChars.length - 1] = curChar;
                continue;
            }
            if (checkUniqueValue(curChar) == true) {
                uniqueChars = Arrays.copyOf(uniqueChars, uniqueChars.length + 1);
                uniqueChars[uniqueChars.length - 1] = curChar;
            }
        }
    }

//    проверяет нету ли такоего символа в массиве uniqueChars
    public static boolean checkUniqueValue(char src) {

        boolean unique = false;
        for (char symb : uniqueChars) {
            if (symb != src) {
                unique = true;
            }
            else {
                return false;
            }
        }
        return unique;
    }


    public static void main(String[] args) {

        TestStrings3.uniqueChars("Using methods of class String");
        System.out.println(TestStrings3.uniqueChars);
    }

}
