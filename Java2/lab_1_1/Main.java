package Lab_1_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by andrew on 22.04.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String source = "/media/Maindata/Дело/study/Java " +
                "Exersises/Java2/Lab_1_1/PackageToCopy/";
        String destination = "/media/Maindata/Дело/study/Java " +
                "Exersises/Java2/Lab_1_1/PackageCopy/";




        File file = new File("/media/Maindata/Дело/study/Java Exersises/Java2/Lab_1_1/PackageToCopy/");


        for (String fileName : file.list()) {

            InputStream istr = new FileInputStream(source + fileName) ;
            OutputStream ostr = new FileOutputStream(destination + fileName);

            try {
                Files.copy(Paths.get(destination+fileName), ostr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
