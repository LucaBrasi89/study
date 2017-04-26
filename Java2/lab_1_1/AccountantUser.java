package lab_1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        25.04.17
 */

public class AccountantUser {

    public final String fileName = "/media/Maindata/Дело/study/Java Exersises/Java2/lab_1_1/company.txt";
    public RandomAccessFile company;
    public File file;


    public AccountantUser() throws IOException {

//        если файл есть - удалим его
        file = new File(fileName);
        if (file.exists()) {
            System.out.println("Есть такой файл, удалим его!");
            Files.delete(Paths.get(fileName));
        }
        company = new RandomAccessFile(new File(fileName), "rw");
        company.writeChars("*TEST STRING*");
    }

    public void testUsers(String userName) throws IOException {

        String line = "";
        company.seek(0);
        while ((line = company.readLine()) != null) {

            System.out.println(company.getFilePointer());
//            если нет такого имени - добавим его в
            String name = line.split(":")[0];
            System.out.println(name);
            if (!(name.equals(userName))) {
                System.out.println("нету такого, добавим");
                company.writeChars(userName + ":" + "0\n");

            }
        }


    }

    public void printFile() {


    }


    public void exitFromDb() {

        try {

            company.close();
        } catch (IOException e) {
            e.printStackTrace();
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
