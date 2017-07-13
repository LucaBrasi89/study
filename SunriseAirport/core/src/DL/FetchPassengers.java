package DL;

import BL.Passenger;

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


    public List<Passenger> getFilteredPassengers(String filterKey, String filterValue) {

        List<Passenger> filteredPassList = new ArrayList<Passenger>();
        for (Passenger passenger : passengerList) {

            if (filterKey.equals("name")) {
                if (filterValue.equals(passenger.getFullName())) {
                    filteredPassList.add(passenger);
                }
            } else if (filterKey.equals("port")) {
                filteredPassList = getFinalCity(filterValue);
                break;

            } else {
                if (filterValue.equals(passenger.getPassport())) {
                    filteredPassList.add(passenger);
                }
            }
        }

        return filteredPassList;

    }

    @Override
    protected void finalize() throws Throwable {

        crud.closeConnection();
        super.finalize();
    }


    public List<Passenger> getFinalCity(String city) {

        passengerList = new ArrayList<Passenger>();
        try {
            ResultSet rs = crud.doQuery("CREATE TEMPORARY TABLE flightsTmp (SELECT flights.*, airports.city\n" +
                    "FROM flights, airports\n" +
                    "WHERE flights.airportName=airports.airportName);\n" +
                    "\n" +
                    "SELECT DISTINCT passengers.*, flightsTmp.city\n" +
                    "FROM passengers, flightsTmp\n" +
                    "WHERE passengers.flightNumber=flightsTmp.flight;");
            while (rs.next()) {

                String passport = rs.getString("passport");
                String birthday = rs.getString("birthday");
                for (Passenger passenger : passengerList) {
                    if (passenger.getPassport().equals(passport) &&
                            passenger.getBirthday().equals(birthday)) {

                        passengerList.add(passenger);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passengerList;
    }


    /*CREATE TEMPORARY TABLE flightsTmp (SELECT flights.*, airports.city FROM flights, airports WHERE flights.airportName=airports.airportName);
    SELECT DISTINCT passengers.*, flightsTmp.city FROM passengers, flightsTmp WHERE passengers.flightNumber=flightsTmp.flight*/


//    CREATE TEMPORARY TABLE flightsTmp (SELECT flights.*, airports.city
//            FROM flights, airports
//                                               WHERE flights.airportName=airports.airportName);
//
//    SELECT DISTINCT passengers.*, flightsTmp.city
//    FROM passengers, flightsTmp
//    WHERE passengers.flightNumber=flightsTmp.flight;


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


}
