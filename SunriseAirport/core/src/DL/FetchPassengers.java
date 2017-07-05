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


    public List<Passenger> getPassengers() {

        List<Passenger> passengerList = new ArrayList<Passenger>();

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


    @Override
    protected void finalize() throws Throwable {

        crud.closeConnection();
        super.finalize();
    }


}
