package lab_1_7.TestStream;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        05.05.17
 */

       /*
                  *  TASK 1.7.4  *
        2) Create a class Person with private fields: name, age and gender, as well as getter and
        setter methods, and constructor, and overridden a toString() method.
        Add in a main() method to create a collection of objects of type Person.
        Then using Stream, select and print to the console all military men (from 18 to 27
        years old).
        3) Determine for list objects of Person type the average age of women with using
        Stream.a collection of objects of type Person
        */

public class Person {

    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
