package lab_1_6.TestAnnotation2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        26.05.17
 */



public class User {

    String name;
    List<PermissionAction> permissions;


    public User(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void getPermissions() {

        System.out.println();
        for (PermissionAction permission :  permissions ) {
            System.out.print(permission);
        }
        System.out.println();
    }

    public void setPermissions(PermissionAction permission) {
        permissions.add(permission);
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyPermission {

        PermissionAction value() default PermissionAction.USER_CHANGE;

    }



}
