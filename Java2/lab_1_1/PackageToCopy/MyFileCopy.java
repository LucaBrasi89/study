package lab_1_1.PackageToCopy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        24.04.17
 *
 *                        Lab Work 1-1-3
 *
 *          Write a class called MyFileCopy whose main(String[] args) method
 *          copies one file (could be binary!) to another (args[0] to args[1]).
 *
 */
public class MyFileCopy {

    public static void main(String[] args) throws IOException {

        try {
            Path source = Paths.get(args[0]);
            OutputStream os = new FileOutputStream(args[1]);
            Files.copy(source, os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

//        "/media/Maindata/Дело/study/Java Exersises/Java2/lab_1_1/some_text.txt" "/media/Maindata/Дело/study/Java Exersises/Java2/lab_1_1/some_text_2.txt"

