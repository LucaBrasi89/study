package lab_2_12;

/**
 * Created by andrew on 12.03.17.
 */
public class UsePhoneNumbers {

    public static void main(String[] args) {

        MyPhoneNumber phNumb = new MyPhoneNumber();
        phNumb.addPhoneNumber("Billy", "066-846-02-15");
        phNumb.addPhoneNumber("Ann", "050-221-15-64");
        phNumb.addPhoneNumber("Asuka", "096-00-13");
        phNumb.addPhoneNumber("Anita", "097-213-41-15");
        phNumb.addPhoneNumber("Sally", "050-221-19-14");
        phNumb.addPhoneNumber("John", "063-491-22-67");

        phNumb.sortByName();
//        phNumb.sortByPhoneNumber();

        phNumb.printPhoneBook();

    }

}
