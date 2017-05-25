package lab_1_5.TestReflection;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        23.05.17
 *
 *      Create a class Main with a main() method.
 *
             1) Add new class MyClass with fields: a, b, c, d of integer type and different access
             modifiers. Add to class getters, setters and few constructors with different
             parameters.
             2) Add code to main() method that declares local variable c of MyClass type, and create
             instance of MyClass. Write code to discover created object and print all information
             about fields, constructor.
             3) Execute the program.
 *
 */
public class MyClass {

    private int a;
    private int b;
    public int c;
    public int d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public MyClass() {

    }

    public MyClass(int a) {
        this.a = a;
    }

    public MyClass(int c, int d) {
        setC(c);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public MyClass(int a, int c, int d) {
        this.a = a;
        this.c = c;
        this.d = d;


    }
}
