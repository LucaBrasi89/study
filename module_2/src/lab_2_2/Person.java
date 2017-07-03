package lab_2_2;

/**
 * Created by andrew on 29.01.17.
 */

        /*Lab work 2.2.4*/

    /*Create class Person with fields firstName(String), lastName(String),
    age (int), gender(String), phoneNumber(int), and five overloaded methods
    that set this fields with different arguments list. Create class that will
    be use instance of class Person and his methods.*/


public class Person {

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    private String firstName = "Andrew";
    private String lastName = "Sotnikov";
    private int age = 22;
    private String gender = "male";
    private int phoneNumber = 123;

    public void setPersonData(String firstName, String lastName, int age,
                              String gender, int phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;

    }


    public void setPersonData(String firstName, String lastName, int age,
                              String gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;


    }


    public void setPersonData(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void setPersonData(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void setPersonData(String firstName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }


}
