package Lab_1_1;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        22.04.17

            ----   Lab Work 1-1-1 ----

         Write a class called MyFilesList whose main(String[] args) method prints to standard out
         the files/directories contained in
         1. the current directory if no args[0] specified, or,
         2. the directory mentioned in args[0].

 */

public class MyFilesList {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String\n");
        List<String> list = new ArrayList<String>();

        while (true) {
            try {
                String s = br.readLine();

                if (s.equals("")) {
                    break;
                }
                list.add(s);
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println(" --- ");
        System.out.println(list.size());

//      получим текующую директорию
        File pwd = new File(System.getProperty("user.dir"));
        if (list.size() == 0) {
            System.out.println(pwd);
        } else {
            for (String dirName : list ) {
                System.out.println(pwd+"/"+dirName);

                for (String elem : new File(pwd+"/"+dirName).list()) {

                    System.out.println("\t\t->"+elem);
                }
            }
        }
    }
}


 /*     for input:

                 module_1
                 module_2
                 Java2
 */
