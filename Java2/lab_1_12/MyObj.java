package lab_1_12;

/**
 * Created by andrew on 18.06.17.
 */
public class MyObj {

    long someinfo;
    public MyObj(long someinfo) {
        this.someinfo = someinfo;
    }

    @Override
    public String toString() {
        return "MyObj{" +
                "someinfo=" + someinfo +
                '}';
    }

    protected void finalize() {

        System.out.println("finalize invoked");
        Main.objRef = this;


    }
}
