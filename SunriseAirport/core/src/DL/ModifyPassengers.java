package DL;

import BL.Passenger;
import BL.PassengerContext;

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
public class ModifyPassengers implements PassengerAction {

    private CRUD crud;
    private Passenger psngr;


    public ModifyPassengers(Passenger psngr) {

        this.crud = new CRUD();
        this.psngr = psngr;

        try {
            crud.createConnection();
            crud.execQuery(generateQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



//    generate a query depending on which button event from {add/edit}
    public String generateQuery() {

        String query;
        if (PassengerContext.getInstance().getActionState().equals("add")) {

//            query to adding in passengers table
            System.out.println("adding to passengers");
            query = String.format("INSERT INTO passengers(flightNumber, firstName, lastName, nationality, " +
                            "passport, birthday, gender, classOfFlight) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s');",
                    psngr.getFlightNumber(), psngr.getFirstName(), psngr.getLastName(), psngr.getNationality(),
                    psngr.getPassport(), psngr.getBirthday(), psngr.getGender(), psngr.getClassOfFlight());
            System.out.println(query);

            return query;
//            query to editing in passengers table
        } else {

            System.out.println("editing passenger");
            query = String.format("UPDATE passengers SET flightNumber='%s'," +
                            "firstName='%s', lastName='%s', nationality='%s', " +
                            "passport='%s', birthday='%s', gender='%s', classOfFlight='%s' " +
                            "WHERE birthday='%s' && passport='%s'",
                    psngr.getFlightNumber(), psngr.getFirstName(),
                    psngr.getLastName(), psngr.getNationality(), psngr.getPassport(),
                    psngr.getBirthday(), psngr.getGender(), psngr.getClassOfFlight(),
                    PassengerContext.getInstance().getNonModifiedBirth(),
                    PassengerContext.getInstance().getNonModifiedPassp());
            System.out.println(query);

            return query;
        }

    }


    @Override
    public void finalize() throws Throwable {

        crud.closeConnection();
        super.finalize();
    }



}
