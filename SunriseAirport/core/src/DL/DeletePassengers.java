package DL;

import BL.Passenger;

import java.sql.SQLException;

/**
 * Created by andrew on 16.07.17.
 */
public class DeletePassengers implements PassengerActoin {

    private CRUD crud;

    public DeletePassengers(Passenger psngr) {

        this.crud = new CRUD();
        try {
            crud.createConnection();
            System.out.println("Deleting user:  " + psngr.getFullName());
            crud.execQuery(String.format("DELETE FROM passengers WHERE birthday='%s' && " +
                    "passport='%s'", psngr.getBirthday(), psngr.getPassport()));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void finalize() throws Throwable {

        crud.closeConnection();
        super.finalize();

    }
}
