package lab_2_15.simple_stack;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        27.03.17
 */
public class UseSimpleStack {

    public static void main(String[] args) {

        SimpleStack st = new SimpleStack();

        for (int i = 1; i <= 12; i++) {
            st.addElemToStack(i);
        }
        st.showAll();

    }

}
