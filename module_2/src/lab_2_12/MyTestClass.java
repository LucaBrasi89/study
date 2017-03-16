package lab_2_12;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        16.03.17
 */


/*

Create new project TestNested2.
        1) Create a new class MyTestClass that has method test(), static nested class
MyStaticNested, inner class MyInner and a method with local inner class MyLocal.
        Make instances of each nested classes.
        2) Create class Main with method main() and add code that accesses the nested classes’
        members from the outer class. Create code that accesses the outer class’s members
        from within the nested classes.
        3) Execute the program.
*/



public class MyTestClass {

    MyTestClass() {
        System.out.println("MyTestClass constructor");

    }
    public void test() {

        System.out.println("you have called test method");
    }

    static class MyStaticNested {


        MyStaticNested() {
            System.out.println("---------");
            System.out.println("I am MyStaticNested");
        }
    }

    class InnerClass {
        InnerClass() {

            System.out.println("---------");
            System.out.println("I am Inner Class");
//          try to invoke an OuterClass
            System.out.println("This is calling to eclosing class from inner class");
            MyTestClass.this.test();

            class MyLocal {
                public MyLocal() {
                    System.out.println("---------");
                    System.out.println("I am LocalClass");
                    MyTestClass myTestClassObj2 = new MyTestClass();
                    System.out.println("This is calling to eclosing class from local class");
                    myTestClassObj2.test();

                }
            }
            new MyLocal();
        }
    }


}
