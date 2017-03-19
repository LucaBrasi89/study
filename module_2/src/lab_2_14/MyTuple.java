package lab_2_14;

import lab_2_2.A;

/**
 * Created by andrew on 19.03.17.
 */
public class MyTuple<A,B,C> {

    public MyTuple(A a, B b, C c) {

        setFirst(a);
        setSecond(b);
        setThird(c);
        System.out.println(getFirst() + " "+ getSecond() + " " + getThird());

    }

    private A first;
    private B second;
    private C third;


    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public C getThird() {
        return third;
    }

    public void setThird(C third) {
        this.third = third;
    }






}
