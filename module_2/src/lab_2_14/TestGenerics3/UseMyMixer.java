package lab_2_14.TestGenerics3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        24.03.17
 */
public class UseMyMixer {

    public static void main(String[] args) {

        System.out.println("------ Lab Work 2.14.4  -------\n");
        System.out.println("Массив интов\n");
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        for (int i = 1; i <= 10 ; i++) {
            arrInt.add(i);
        }
        System.out.println(arrInt);

        System.out.println("\nМассив чаров");
        ArrayList<Character> arrChar = new ArrayList<Character>();
        for (int i = 65; i <= 75 ; i++) {
            arrChar.add((char) i);
        }
        System.out.println(arrChar);
        System.out.println("\nТосованный массив интов");
        MyMixer<Integer> myMixInt = new MyMixer<>(arrInt) ;
        System.out.println(myMixInt.shuffle());
        System.out.println("\nТосованный массив чаров");
        MyMixer<Character> myMixChar = new MyMixer<>(arrChar) ;
        System.out.println(myMixChar.shuffle());

    }

}
