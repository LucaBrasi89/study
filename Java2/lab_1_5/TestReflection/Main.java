package lab_1_5.TestReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        23.05.17
 */
public class Main {

    public static void main(String[] args) throws Exception{

        MyClass c = new MyClass(5, 4, 11);

        Class<?> cls = c.getClass();
        System.out.println("\nAvailable constructors:");
        for (Constructor<?> constr : cls.getConstructors()) {

            System.out.println("\t" + constr.getName());
            for (Parameter param : constr.getParameters() ) {
                System.out.println("\t" + param.getType() + " " + param.getType());

            }
        }

        System.out.println("\nJust public fields:");
        for (Field field : cls.getFields()) {
            System.out.println("\t" + field.getType() + "   " + field.getName());
        }

        System.out.println("\nAll fields:");
//        this is all field, including private
        for (Field field : cls.getDeclaredFields()) {
            System.out.println("\t" + field.getType() + "   " + field.getName());

        }
        System.out.println("\nAll methods:");
//        this is all methods
        for (Method method: cls.getDeclaredMethods()) {
            System.out.println("\t" + method.getReturnType() + "   " + method.getName());

        }

        System.out.println("\ndynamical invokation\n");
//      Dynamically invokation!
        Constructor<?> constr = cls.getConstructor(int.class);
        Object[] arguments = {new Integer(33)};
        Object instance = constr.newInstance(arguments);
        Object arg = new Integer(9);

        Method setB = cls.getDeclaredMethod("setA", int.class);
        setB.invoke(c, arg);
        System.out.println(instance);

    }


}
