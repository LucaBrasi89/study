package lab_1_2.DemoSerialize;

import java.io.*;

/**
 * Created by andrew on 23.04.17.
 * <p>
 * Lab Work 1-2-5
 * <p>
 * 1) Modify class User replacing the implementation of Serializable on interface
 * Externalizable. Override methods writeExternal (ObjectOutput out) and readExternal
 * (Object Input in);
 * 2) Create a class Main with a main() method, which initializes an array of User users;
 * 3) Add code in a main() method that writes an array of users in the "userfile.ser" file;
 * 4) Add code in a main() method that reads from a file "userfile.ser" all users and prints
 * them to the console.
 * 5) Execute the program.
 */
public class DeserializeDemo2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


//        fill array with values
        Employee2[] users = {new Employee2("Andrew", "Kyiv", 123, 051),
                new Employee2("Kate", "Lviw", 124, 052),
                new Employee2("Ann", "London", 125, 053),
                new Employee2("Jenifer", "Milan", 132, 062)};

//                serialize
        FileOutputStream fos = new FileOutputStream
                ("Java2/lab_1_2/DemoSerialize/users.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Employee2 user : users) {
            oos.writeObject(user);
        }
        oos.flush();
        oos.close();

//            deserialize
        FileInputStream fis = new FileInputStream("Java2/lab_1_2/DemoSerialize/users.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (true) {
                System.out.println((Employee2) ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("\nend of file has been reached...");
            ois.close();
        }
    }
}
