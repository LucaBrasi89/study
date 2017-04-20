package lab_2_18.TestCore4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.04.17
 * <p>
 * Lab Work 2-18-4
 * <p>
 * Create new project called TestCore4. Add package “com.brainacad.oop.testcore4”.
 * Write a program that demonstrates the run for execution of other programs.
 */
public class Main {

    public static void main(String[] args) {

        List<String> apps = new ArrayList<String>();
        apps.add("gedit");
        apps.add("gnome-calculator");
        apps.add("xfce4-dict");
        Scanner sc = new Scanner(System.in);
        System.out.println("please input val from 0 to 2");
        String chosenApp;
        while (true) {

            try {
                chosenApp = apps.get(sc.nextInt());
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
            break;
        }
        try {
            Runtime.getRuntime().exec(chosenApp);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
