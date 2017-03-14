package lab_2_12;

/**
 * Created by andrew on 12.03.17.
 */
public class UsePhoneNumbers {

    public static void main(String[] args) {

        MyPhoneNumber phNumb = new MyPhoneNumber();
        phNumb.addPhoneNumber("Person1", "123-45-67");
        phNumb.addPhoneNumber("Person2", "123-45-67");
        phNumb.addPhoneNumber("Person3", "123-45-67");
        phNumb.addPhoneNumber("Person4", "123-45-67");
        phNumb.addPhoneNumber("Person5", "123-45-67");


        phNumb.printPhoneBook();

    }

}
