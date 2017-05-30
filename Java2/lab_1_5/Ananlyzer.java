package lab_1_5;

import java.lang.reflect.Constructor;

/**
 * Created by andrew on 20.05.17.
 */
public  class Ananlyzer {

    public static void analyzeConstr(String className) throws ClassNotFoundException {

        Class<?> cls = Class.forName(className);
        Constructor<?>[] constr = cls.getConstructors();
        for (Constructor<?> ctr : constr ) {

            Class<?>[] paramTypes = ctr.getParameterTypes();
            System.out.println(ctr.getParameterCount());
//            for (Class<?> paramType : paramTypes) {
//                System.out.println(paramType.getName());
//            }
        }



        }




    public static void main(String[] args) throws ClassNotFoundException {

//        Car car = new Car();
        analyzeConstr("lab_1_5.Car");


    }


}
