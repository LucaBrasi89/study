package module_2.src.lab_2_4;

/**
 * Created by andrew on 04.02.17.
 */
public class UseEmployee {

    public static void main(String[] args) {

        Employee person1 = new Employee("Andrew","Sotnikov","engineer","123-45-88");
        Employee person2 = new Employee("Julia","Frolova","doctor","444-47-92");
        Employee person3 = new Employee("Kate","Winslett","actor","555-41-98");
        Employee person4 = new Employee("Luk","Skywalker","jedi","n/a");

        System.out.printf("Staff of our firm contain - %2d employees", Employee.getNumberOfEmployees());


    }


}
