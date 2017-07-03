package lab_2_2;

/**
 * Created by andrew on 29.01.17.
 */
public class RealPerson {

    public static void main(String[] args) {


        Person realPerson = new Person();
        realPerson.setPersonData("Mary","Poppins",18);
        System.out.println(realPerson);
        realPerson.setPersonData("John");
        System.out.println(realPerson);


    }

}
