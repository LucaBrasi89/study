package dl.model;

/**
 * Created by andrew on 14.07.17.
 * <p>
 * All classes which implements this interface should have CRUD object
 * for do basic operations and overwrite finalize() for closing DB connection.
 */


public interface PassengerAction {

    CRUD crud = null;

    //    close connection
    void finalize() throws Throwable;

}
