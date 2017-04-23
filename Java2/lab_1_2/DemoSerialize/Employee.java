package lab_1_2.DemoSerialize;

/**
 * Created by andrew on 23.04.17.
 */
public class Employee implements java.io.Serializable {

    private String name;
    private String addressl;
    private int SSN;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressl() {
        return addressl;
    }

    public void setAddressl(String addressl) {
        this.addressl = addressl;
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
                ", addressl='" + addressl + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
