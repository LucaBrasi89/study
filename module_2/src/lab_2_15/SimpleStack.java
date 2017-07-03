package lab_2_15;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by andrew on 25.03.17.
 */
public class SimpleStack {

    private Deque stack = new LinkedList();

    public void showAll() {

        /*for (Object elem : stack) {
            System.out.print("  " + elem);
            System.out.println(stack);
        }*/

        Deque tmpStack = new LinkedList(stack);

        for ( Object elem : stack) {
            System.out.print(" " + tmpStack.getLast());
            tmpStack.removeLast();
        }
    }

    public void addToStack(Object elem) {

        if (stack.size() > 10) {
            stack.pop();
        }
        stack.addLast(elem);


    }


}
