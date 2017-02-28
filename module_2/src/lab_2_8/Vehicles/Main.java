package lab_2_8.Vehicles;

/**
 * Created by andrew on 25.02.17.
 */
public class Main {

    public static void moveVehical(Vehicle v) {

        v.move();
        System.out.println(v.getClass().getSimpleName());

    }

    public static void main(String[] args) {

        moveVehical(new Truck());
        moveVehical(new Car());



    }
}
