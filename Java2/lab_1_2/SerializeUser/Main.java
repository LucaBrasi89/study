package lab_1_2.SerializeUser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrew on 23.04.17.
 *
 *                                        Lab Work 1-2-4
 *
 *              Create new project called SerializeUser. Add package “com.brainacad.serialize_user”.
         1) Create class User with private fields : String firstName, String lastName, int age. Add
         getters and setters to User class. Add two constructors: one with no arguments,
         another with parameters. Override the toString() method.
         2) Create a class Main with a main() method, which creates an instance User and adds it
         to the "users.ser" file using serialization (Note, to append to a file, use class
         RandomAccessFile and a method of writeBytes(String ...));
         3) Add code in a main() method that reads from a file "users.ser" using de-serialization
         all users and prints them
  *
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        пишем в файл
        File filePath = new File("Java2/lab_1_2/SerializeUser/users.ser");
        User user = new User("Bruce", "Lee", 28);
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.writeBytes(user.toString());
        file.close();

//        делаем deserialize
        FileInputStream fis = new FileInputStream(new File("Java2/lab_1_2/SerializeUser/users.ser"));
        String rawString = String.valueOf(Files.readAllLines(Paths.get("Java2/lab_1_2/SerializeUser/users.ser")));

//        парсит по на 3 группы. Имя, фамилия, возраст
        Pattern pattern = Pattern.compile("((?<=\\')[a-zA-Z]*(?=\\')).*((?<=\\')[a-zA-Z].*(?=\\')).*((?<=\\=)[\\d]*(?=\\}))");
        Matcher m = pattern.matcher(rawString);
        m.find();

        User lee = new User();
//        lee.setName((String) ois.readObject());
//        lee.setLastname((String) ois.readObject());
//        lee.setAge((Integer) ois.readObject());
        lee.setName(m.group(1));
        lee.setLastname(m.group(2));
        lee.setAge(Integer.parseInt(m.group(3)));
        System.out.println(lee);

    }
}
