package lab_2_11;

/**
 * Created by andrew on 11.03.17.
 */
public class MyException extends Exception {


    private String message;

    MyException(String message) {
        setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {

        System.out.println(getMessage());
    }
}
