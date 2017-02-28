package lab_2_5;

/**
 * Created by andrew on 08.02.17.
 */

/*     Lab work 2.5.1 и Lab work 2.5.5*/

/*  Write class InitTest with private field id of int type and static private field nextId of
    integer. Write code that:
    - Initialize static field nextId of some random value (in 1 ... 1000 range) once when
    class loaded to JVM;
    - Increments static field nextId each time when new instance of InitTest created;
    - Initialize field id of nextId field value each time when new instance of InitTest created.
    And method getId() which will return value of id.
    Create class Main, which will create five instances of class InitTest and invokes method
    getId() on each instance and print returned value on console. */

public class InitTest2 {

    private int id;
    private static int nextId;
    private static int counter = 0;

    static {
        nextId = (int) (Math.random() * (1001 - 1));

    }

    public InitTest2() {

        nextId++;
        counter++;
        System.out.printf("I am %sth object \n", counter);
        id = nextId;
        getId();
    }

    public void getId() {
        System.out.printf("This is ID value: %d", id);
        System.out.println("\n_______\n\n");
    }


}
