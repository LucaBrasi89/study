package lab_2_16;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        06.04.17
 */
public class Main {

    public void foo(Animal a) {

        System.out.println("This is animal");
    }

    public void foo(Dog d) {

        System.out.println("This is dog");
    }

    public void foo(Puppy p) {

        System.out.println("This is puppy");
    }


    public void foo(int i) {

        System.out.println("I am integer");
    }

    public void foo(Byte b) {

        System.out.println("I am Byte");
    }

    public void foo(byte b) {

        System.out.println("I am byte");
    }


    public void foo(int a, int b) {

        System.out.println("I am a simple method with two arguments");
    }

    public void foo(int... a) {

        System.out.println("I can receive varargs ");
    }


    public static void main(String[] args) {

//        task 2.16.1
        Animal a = new Dog();
        Main m = new Main();
        m.foo(a);
        System.out.println("-   -   -   -  ");

//        task 2.16.2
        byte b = 16;
        m.foo(b);
        System.out.println("-   -   -   -  ");

//        task 2.16.3
        m.foo(1, 2);
        m.foo(1, 2, 3);
        System.out.println("-   -   -   -  ");


//        task 2.16.4
        m.foo((Puppy) null);
        System.out.println("-   -   -   -  ");


//        task 2.16.5
        byte b2 = 5;
        m.foo(b2);
        m.foo(5);

    }

}
