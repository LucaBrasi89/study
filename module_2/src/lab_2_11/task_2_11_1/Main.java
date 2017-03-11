package lab_2_11.task_2_11_1;

/**
 * Created by andrew on 11.03.17.
 */
public class Main {

    public static void main(String[] args) {

        try {
            throw new Exception("something occured");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            System.out.println("I was here... In finally block");
        }
    }

}
