package module_2.src.lab_2_4;

/**
 * Created by andrew on 04.02.17.
 */

/*  =====Laboratory work 2.4.4=====
    TASK:
    1) Create Employee class with fields firstName, lastName, occupation, telephone
     and static field numberOfEmployees and getters/setters.
     2) Class must have constructor, which will initialize class fields and
     increment numberOfEmployees.
     3) Create multiple instances of Employee class and the output numberOfEmployees
      field to the console.
  */

public class Employee {

    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;



    static private int numberOfEmployees = 0;


    public Employee(String firstName, String lastName, String occupation,
                        String telephone) {

        setFirstName(firstName);
        setLastName(lastName);
        setOccupation(occupation);
        setTelephone(telephone);
        numberOfEmployees++;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;

    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }


}
