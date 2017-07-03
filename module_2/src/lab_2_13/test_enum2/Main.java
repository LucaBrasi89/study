package lab_2_13.test_enum2;

import lab_2_13.test_enum1.MyDayOfWeek;

import java.util.Scanner;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        18.03.17
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        MyDayOfWeek myDayOfWeek = MyDayOfWeek.SUNDAY;
        myDayOfWeek.nextDay(userInput);



    }

}
