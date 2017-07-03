package lab_2_2;

/**
 * Created by andrew on 29.01.17.
 */
public class Employee {

     public void calcSalary(String name, double... salary) {

        double sumSalaries = 0;
        for (double val : salary) {

            sumSalaries = sumSalaries + val;

        }
        System.out.println("name: "+ name);
        System.out.println(sumSalaries);

    }


}
