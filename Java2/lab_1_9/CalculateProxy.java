package lab_1_9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        01.06.17
 */

public class CalculateProxy implements InvocationHandler {

    Object objCalc;
    Class[] interfaces;
    Object[] targets;

    public CalculateProxy(Class[] interfaces, Object[] targets) {

        this.interfaces = interfaces;
        this.targets = targets;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        Class declaringClass = method.getDeclaringClass();
        for (int i = 0; i < interfaces.length; i++) {
            if (declaringClass.isAssignableFrom(interfaces[i])) {
                return method.invoke(targets[i], args);
            }
        }
        System.out.println("Method cannot be dispatched");
        return null;
    }


    public static Object newInstance(Class interfaceClass) {

        Object[] delegators = new Object[]{new CalculateImpl(), new CalculateBitwiseImpl()};
        List<Class<?>> listInterfaces = Arrays.asList(Calculate.class, CalculateBitwise.class);
        if (listInterfaces.contains(interfaceClass)) {
            Class[] proxyInterfaces = listInterfaces.toArray(new Class[listInterfaces.size()]);
            return Proxy.newProxyInstance(
                    interfaceClass.getClassLoader(),
                    proxyInterfaces,
                    new CalculateProxy(proxyInterfaces, delegators));
        }
        System.out.println("can't create obj");

        return null;
    }
}