package BL;

/**
 * Created by andrew on 05.06.17.
 */
public class Passenger {

    private String flightNumber;
    private String firstName;
    private String lastName;
    private String nationality;
    private String passport;
    private String birthday;
    private  String gender;
    private String classOfFlight;

    public Passenger(String flightNumber, String firstName, String lastName, String nationality, String passport, String birthday, String gender, String classOfFlight) {
        this.flightNumber = flightNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.passport = passport;
        this.birthday = birthday;
        this.gender = gender;
        this.classOfFlight = classOfFlight;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "flightNumber='" + flightNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", passport='" + passport + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", classOfFlight='" + classOfFlight + '\'' +
                '}';
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName() {return (this.firstName + " " + this.lastName);}

    public String getClassOfFlight() {
        return classOfFlight;
    }

    public void setClassOfFlight(String classOfFlight) {
        this.classOfFlight = classOfFlight;
    }
}
