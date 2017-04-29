package lab_1_2.DemoSerialize;

import java.io.*;

/**
 * Created by andrew on 23.04.17.

                                Lab Work 1-2-5

         1) Modify class User replacing the implementation of Serializable on interface
         Externalizable. Override methods writeExternal (ObjectOutput out) and readExternal
         (Object Input in);
         2) Create a class Main with a main() method, which initializes an array of User users;
         3) Add code in a main() method that writes an array of users in the "userfile.ser" file;
         4) Add code in a main() method that reads from a file "userfile.ser" all users and prints
         them to the console.
         5) Execute the program.

 */
public class Employee2 implements Externalizable {

    private String name;
    private String address;
    private int SSN;
    private int number;

    public Employee2(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    public Employee2() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressl() {
        return address;
    }

    public void setAddressl(String addressl) {
        this.address = addressl;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", addressl='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {


        out.writeObject(name);
        out.writeObject(address);
        out.writeInt(SSN);
        out.writeInt(number);


    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        name = (String) in.readObject();
        address = (String) in.readObject();
        SSN = in.readInt();
        number = in.readInt();


    }
}
