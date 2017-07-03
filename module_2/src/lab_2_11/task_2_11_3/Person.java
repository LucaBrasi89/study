package lab_2_11.task_2_11_3;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        11.03.17
 */
public class Person {

    private String name;
    private String lastName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 && age > 120) {
            this.age = age;

        } else {
            throw new InvalidAgeException();
        }


    }
}
