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
    private List<Flight> depatureFL;
    private List<Flight> arrivalFL;


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

        arrivalFL = new ArrayList<Flight>();

        try {
            ResultSet rs = crud.doQuery("SELECT * FROM `flights` WHERE `typeOfFlight`='arrival'");
            while (rs.next()) {

                arrivalFL.add(new Flight(rs.getString("flight"),
                        rs.getString("airportName"),
                        rs.getString("time"),
                        rs.getString("terminal").charAt(0),
                        rs.getString("status")));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return arrivalFL;
    }


    //    getting a list of depatures for showing it into the depature table
    public List<Flight> getDepatures() {

        depatureFL = new ArrayList<Flight>();

        try {
            ResultSet rs = crud.doQuery("SELECT * FROM `flights` WHERE `typeOfFlight`='depature'");
            while (rs.next()) {

                depatureFL.add(new Flight(rs.getString("flight"),
                        rs.getString("airportName"),
                        rs.getString("time"),
                        rs.getString("terminal").charAt(0),
                        rs.getString("status")));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return depatureFL;
    }

    public List<Flight>  getFilteredFlights(String charSequence, String typeOfFlight) {

        List<Flight> flightsList = null;
        List<Flight> filteredFlightList = new ArrayList<>();
        if (typeOfFlight.equals("arrival")) {
            flightsList = arrivalFL;
        } else if (typeOfFlight.equals("depature")) {
            flightsList = depatureFL;
        }
        for (Flight flight : flightsList) {
            if (flight.getFlight().contains(charSequence)) {
                filteredFlightList.add(flight);
            }
        }
        return filteredFlightList;
    }

    @Override
    protected void finalize() throws Throwable {

        super.finalize();
        crud.closeConnection();
    }
}










