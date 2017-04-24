package lab_1_1;

import java.io.*;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        24.04.17
 *
 *                  Lab Work 1-1-2
 *
 *      Write a class called PrintFile whose main(String[] args) method reads all the text from
 *      the file mentioned on the command-line (args[0]) line-by-line and prints it to standard
 *      out.
 *
 */
public class PrintFile {

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line =  "";
            while (( line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//        "/media/Maindata/Дело/study/Java Exersises/Java2/lab_1_1/some_text.txt"