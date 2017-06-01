package lab_1_6.TestAnnotation2;

/**
 * Created by andrew on 27.05.17.
 */
public class Action {

    @User.MyPermission(value = PermissionAction.USER_CHANGE)
    public static void writeFile(User user) {


        try {
            Class<?> action = Class.forName("lab_1_6.TestAnnotation2.Action");
            Class<?> userClass = Class.forName("lab_1_6.TestAnnotation2.User");

            PermissionAction annotPerm = null;
            try {
                annotPerm = action.getDeclaredMethod("writeFile", User.class).getDeclaredAnnotation(User.MyPermission.class).value();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            if (user.getPermissions().contains(annotPerm)) {

                System.out.println("Access allowed for " + user.getName() + ", write is possible");
            } else {
                System.out.println("Access forbidden!" + user.getName() + " can't write ");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    @User.MyPermission(value = PermissionAction.USER_READ)
    public static void readFile(User user) throws NoSuchMethodException {


        try {
            Class<?> action = Class.forName("lab_1_6.TestAnnotation2.Action");
            Class<?> userClass = Class.forName("lab_1_6.TestAnnotation2.User");
            PermissionAction annotPerm = action.getDeclaredMethod("readFile", User.class).getDeclaredAnnotation(User.MyPermission.class).value();

            if (user.getPermissions().contains(annotPerm)) {

                System.out.println("Access allowed for " + user.getName() + ", read is possible");
            } else {
                System.out.println("Access forbidden!" + user.getName() + " can't read ");
            }


        } catch (
                ClassNotFoundException e)

        {
            e.printStackTrace();
        }


    }


}
