package lab_1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        25.04.17
 */

public class AccountantUser {

    public final String fileName = "/media/Maindata/Дело/study/Java Exersises/Java2/lab_1_1/company.txt";
    public RandomAccessFile file;
    private boolean fileIsEmpty = true;


    public AccountantUser() throws IOException {

//        если файл есть - удалим его
        System.out.println("Удалим файл с прошлого раза");
        Files.delete(Paths.get(fileName));
        file = new RandomAccessFile(new File(fileName), "rw");
    }

    @Override
    protected void finalize() throws Throwable {

        file.close();
        ;

    }

    public int testUsers(String userName) throws IOException {

        String line = "";
        boolean userProcessed = false;
//        если файл пустой, то запишем хоть одну строку для коректной работы
        if (fileIsEmpty) {
            file.writeBytes(userName + ":" + "0\n");
            fileIsEmpty = false;
            return 0;
        }
        file.seek(0);
        while ((line = file.readLine()) != null) {
            Long pointer = file.getFilePointer() - 1;
//            если нет такого имени - добавим его
            String name = line.split(":")[0];
            int number = Integer.parseInt(line.split(":")[1]);
            if (name.equals(userName)) {
                System.out.println("\nесть такой");
                file.seek(pointer - line.length());
                file.writeBytes(userName + ":" + (++number) + "\n");
                userProcessed = true;
                break;
            }
            System.out.println(file.getFilePointer());
        }

        if (!userProcessed) {
//      походу такого юзера нет и мы находимся в конце файла
            file.writeBytes(userName + ":0\n");
        }

        return 0;
    }

    public void printFile() throws IOException {

        file.seek(0);
        String line = "";
        while ((line = file.readLine()) != null) {
            System.out.println(line);
        }
    }


    public void clearDataBase() {

        try {
            Files.delete(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
