package lab_2_15.simple_stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        27.03.17
 */

/*
task:
      Create a stack of FIFO type.
      New element is inserted to the begin of queue and near element moves.
      When stack size eqals to 10 - last element is removed.
*/

public class SimpleStack {

    private Deque stack = new LinkedList();

    public void addElemToStack(Object elem) {

        try {
            if (stack.size() == 10) {
                stack.pollLast();
                stack.addFirst(elem);
            } else {

                stack.addLast(elem);
            }

        } catch (NullPointerException e) {
            System.out.print(e.getMessage());
        }
    }

    public void showAll() {

        for (Object elem : stack) {
            System.out.print(" " + elem);
        }
    }
}
