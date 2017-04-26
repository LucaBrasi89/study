package lab_1_1;

import java.io.*;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        25.04.17

                            Lab Work 1-1-4

     Write a class called ReplacementInFile whose main(String[] args) method read the
     source code of any Java-program and replaces all the words public on private. The file
     name must be entered from the keyboard.


 */
public class ReplacementInFile {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        try {
            FileReader fileToRead = new FileReader(file);
//            генерируем и создаем файл на запись
            String fileDestination = args[0].replace("public","private");
            FileWriter fileToWrite = new FileWriter(fileDestination);

            int c;
            char tmp_char;
            String output =  new String();

//            читаем побайтово
            while ((c = fileToRead.read()) != -1) {
                tmp_char = (char) c;
                output = output + new String(String.valueOf(tmp_char));

            }
//            считали, дальше заменим содержимое с паблика на прайвет

            String repcacedOutput = output.replaceAll("public", "private");
            System.out.println(repcacedOutput);

//            пишем в файл наши измениня
            fileToWrite.write(repcacedOutput);
            fileToWrite.flush();
            fileToWrite.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}

//          "/media/Maindata/Дело/study/Java Exersises/Java2/lab_1_1/file_with_public.txt"
