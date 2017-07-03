package lab_1_2.DemoSerialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by andrew on 23.04.17.
 */
public class SerializeDemo {


    public static void main(String[] args) throws IOException {

        Employee empl = new Employee();
        empl.setName("John Doe");
        empl.setAddressl("Tokyo");
        empl.setNumber(12345678);
        empl.setSSN(692);

        FileOutputStream fos = new FileOutputStream("/media/Maindata/Дело/study/Java Exersises/Java2/lab_1_2/DemoSerialize/employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(empl);

    }

}

