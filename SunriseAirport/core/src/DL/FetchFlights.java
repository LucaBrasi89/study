package DL;

import BL.Flight;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 16.06.17.
 */
public class FetchFlights {

    private CRUD crud;

    public FetchFlights() {

        this.crud = new CRUD();

        try {
            crud.createConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

//    getting a list of arrivals for showing it into the arrival table
    public List<Flight> getArrivals() {

        List<Flight> flightsList = new ArrayList<Flight>();

        try {
            ResultSet rs = crud.doQuery("SELECT * FROM `flights` WHERE `typeOfFlight`='arrival'");
            while (rs.next()) {

                flightsList.add(new Flight(rs.getString("flight"),
                        rs.getString("airport"),
                        rs.getString("time"),
                        rs.getString("terminal").charAt(0),
                        rs.getString("status")));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flightsList;
    }


    //    getting a list of depatures for showing it into the depature table
    public List<Flight> getDepatures() {

        List<Flight> flightsList = new ArrayList<Flight>();

        try {
            ResultSet rs = crud.doQuery("SELECT * FROM `flights` WHERE `typeOfFlight`='depature'");
            while (rs.next()) {

                flightsList.add(new Flight(rs.getString("flight"),
                        rs.getString("airport"),
                        rs.getString("time"),
                        rs.getString("terminal").charAt(0),
                        rs.getString("status")));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flightsList;
    }


    @Override
    protected void finalize() throws Throwable {

        crud.closeConnection();
        super.finalize();
    }
}










