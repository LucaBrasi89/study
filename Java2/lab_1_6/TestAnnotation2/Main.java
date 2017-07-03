package lab_1_6.TestAnnotation2;

import javax.swing.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        26.05.17
 */

/*
        Add package “com.brainacad.oop.testcustomannotation”.
        Write a program that implements a different access to the file operation for different
        users using annotations.
        1) Create a enum type PermissionAction which specify access to operations on the file
        (example, USER_READ, USER_CHANGE, ...).
        2) Create a class User with private fields: name of String type and permissions of
        List<PermissionAction> type. Add to User constructor with name argument and
        override toString() method to return name of user. Add to User methods to get the
        permissions list and add a new permission.
        3) Describe custom annotation MyPermission with value() method, which returns value
        PermissionAction of type. Annotation should have a policy of retention
        RetentionPolicy.RUNTIME and used with methods
*/


public class Main {

    @User.MyPermission(PermissionAction.USER_READ)

    public static void main(String[] args) throws NoSuchMethodException {

        User user1 = new User("rwx");
        user1.setPermissions(PermissionAction.USER_CHANGE);
        user1.setPermissions(PermissionAction.USER_READ);
        user1.getPermissions();

        User user2 = new User("rx");
        user2.setPermissions(PermissionAction.USER_READ);
        user2.getPermissions();

        User user3 = new User("wx");
        user3.setPermissions(PermissionAction.USER_CHANGE);
        user3.getPermissions();

        Action.readFile(user1);
        Action.readFile(user2);
        Action.readFile(user3);

        Action.writeFile(user1);
        Action.writeFile(user2);
        Action.writeFile(user3);


    }



}
