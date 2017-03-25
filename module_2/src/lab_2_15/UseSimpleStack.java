package lab_2_15;

/**
 * Created by andrew on 25.03.17.
 */
public class UseSimpleStack {

    public static void main(String[] args) {

        SimpleStack stack = new SimpleStack();
        for (int i = 1; i <= 30 ; i++) {
            stack.addToStack(i);
        }
        stack.showAll();

    }

}
