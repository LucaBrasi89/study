package DL;

import BL.Flight;
import BL.Passenger;
import BL.TypeOfFlight;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 05.07.17.
 */
public class FetchPassengers {

    private CRUD crud;
    private List<Passenger> passengerList;

    public FetchPassengers() {

        this.crud = new CRUD();

        try {
            crud.createConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public List<Passenger> getAllPassengers() {

        passengerList = new ArrayList<Passenger>();

        try {
            ResultSet rs = crud.doQuery("SELECT * FROM `passengers`");
            while (rs.next()) {

                passengerList.add(new Passenger(rs.getString("flightNumber"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("nationality"),
                        rs.getString("passport"),
                        rs.getString("birthday"),
                        rs.getString("gender"),
                        rs.getString("classOfFlight")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passengerList;

    }

    public List<Passenger> getFilteredPassengers(String filterKey, String filterValue) {

        List<Passenger> filteredPassList = new ArrayList<Passenger>();
        for (Passenger passenger : passengerList) {

            if (filterKey.equals("name")) {
                if (filterValue.equals(passenger.getFullName())) {filteredPassList.add(passenger);}
            } else if (filterKey.equals("port")) {
                //
            } else {
                if (filterValue.equals(passenger.getPassport())) {filteredPassList.add(passenger);}
            }


        }

        return filteredPassList;

    }


    @Override
    protected void finalize() throws Throwable {

        crud.closeConnection();
        super.finalize();
    }


}
