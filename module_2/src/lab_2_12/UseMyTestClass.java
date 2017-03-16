package lab_2_12;

import lab_2_11.task_2_11_1.MyTest;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        16.03.17
 */
public class UseMyTestClass {

    public static void main(String[] args) {

        //        try to invoke an InnerClass constructor
        MyTestClass myTestObj = new MyTestClass();
        MyTestClass.InnerClass innerClassObj = myTestObj.new InnerClass();

        //        try to invoke a MyStaticNested
        new MyTestClass.MyStaticNested();




    }

}
