package lab_1_2.DemoSerialize;

import java.io.*;

/**
 * Created by andrew on 23.04.17.
 *
 */
public class DeserializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("employee.ser");
        System.out.println(file.getAbsolutePath());

        try {
            FileInputStream fis = new FileInputStream
                    ("Java2/lab_1_2/DemoSerialize/employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee empl = (Employee) ois.readObject();

            System.out.println(empl);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
