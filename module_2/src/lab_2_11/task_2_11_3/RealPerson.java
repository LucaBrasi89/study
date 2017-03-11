package lab_2_11.task_2_11_3;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        11.03.17
 */
public class RealPerson {

    public static void main(String[] args) {

        Person immortal = new Person();
        try {
            immortal.setAge(1);
        }
        catch (InvalidAgeException e) {
            System.out.println("Not valid age");
        }
        try {
            immortal.setAge(140);
        }
        catch (InvalidAgeException e) {
            System.out.println("Not valid age");
        }


    }

}
