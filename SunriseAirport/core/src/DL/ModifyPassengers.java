package DL;

import BL.Passenger;

import java.sql.SQLException;

/**
 * Created by andrew on 13.07.17.
 * <p>
 * <p>
 * This class works with passengers table. It's provide following operations:
 * <p>
 * -update passenger data
 * -remove passenger from table
 * -insert passenger into the table
 */
public class ModifyPassengers {

    private CRUD crud;

    public ModifyPassengers() {

        this.crud = new CRUD();

        try {
            crud.createConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void updatePassenger(Passenger psngr) {

        System.out.println(psngr);
//        try {
//            ResultSet rs = crud.doQuery(String.format(
//                    "UPDATE passengers SET flightNumber=%s," +
//                            "firstName=%s, lastName=%s, nationality=%s, " +
//                            "passport=%s, birthday=%s, gender=%s, class=%s",
//                    psngr.getFlightNumber(), psngr.getFirstName(),
//                    psngr.getLastName(), psngr.getNationality(), psngr.getPassport(),
//                    psngr.getBirthday(), psngr.getGender(), psngr.getClassOfFlight()
//            ));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }


    @Override
    protected void finalize() throws Throwable {

        crud.closeConnection();
        super.finalize();
    }


}
