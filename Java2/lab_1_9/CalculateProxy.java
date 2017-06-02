package lab_1_9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        01.06.17
 */
public class CalculateProxy implements InvocationHandler {

    Object objCalc;

    public CalculateProxy(Object target) {
        this.objCalc = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("method was called: " + method.getName());
        System.out.println("args was passed: ");
        for (Object arg : args) {
            System.out.print("   " + arg);
        }

        return method.invoke(objCalc, args);
    }

    public static Object newInstance(Object obj) {

        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new CalculateProxy(obj));
    }
}
