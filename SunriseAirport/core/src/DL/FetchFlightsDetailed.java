package DL;

import BL.FlightDetailed;
import BL.Passenger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.getInt;

/**
 * Created by andrew on 16.06.17.
 */
public class FetchFlightsDetailed implements PassengerAction {

    private CRUD crud;
    private List<FlightDetailed> flightsDetailed = new ArrayList<FlightDetailed>();



    public FetchFlightsDetailed() {


        this.crud = new CRUD();

        try {
            crud.createConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

//          getting a list of all flights with details (route, class, cost).
//          Every flight devided by classOfFlight.
    public List<FlightDetailed> getRawFlights() {


        List<FlightDetailed> tmpFlights = new ArrayList<FlightDetailed>();

        try {
            ResultSet rs = crud.doQuery("SELECT flights.flight, flights.airportName, " +
                    "flights.time, flights.typeOfFlight, prices.cost, prices.classOfFlight " +
                    "FROM flights, prices WHERE flights.flight=prices.flightName" +
                    "ORDER BY flight;");
            while (rs.next()) {
                        String flightNumber =  rs.getString("flight");
                        String airportName = rs.getString("airportName");
                        String time = rs.getString("time");
                        String typeOfFlight = rs.getString("typeOfFlight");
                        int businessPrice;
                        int economyPrice;
                        if (rs.getString("classOfFlight").equals("business")) {
                             businessPrice = rs.getInt("price");
                            economyPrice = 0;
                        } else {
                           businessPrice = 0;
                            economyPrice = rs.getInt("price");;
                        }

                        tmpFlights.add(new FlightDetailed(flightNumber, airportName, time, typeOfFlight,
                                0, 0, economyPrice, businessPrice));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tmpFlights;
    }


    public List<FlightDetailed> getFlights() {




        return flightsDetailed;
    }


    public void fillPrice() {

        List<FlightDetailed> tmpFlights = getRawFlights();

        for (int i = 0; i < tmpFlights.size(); i=i+2) {

            FlightDetailed fdBus = tmpFlights.get(i);
            FlightDetailed fdEco = tmpFlights.get(i+1);
            flightsDetailed.add(new FlightDetailed(fdBus.getFlightNumber(), fdBus.getAirportName(), fdBus.getTime(),
                    fdBus.getTypeOfFlight(),0,0, fdEco.getEconomyPrice(),
                    fdBus.getEconomyPrice()));
        }
    }



    public void fillPassCount() {

        for (FlightDetailed flightDetailed : flightsDetailed) {

            try {
                int businessPrice = crud.doQuery(String.format("SELECT * FROM passengers WHERE flightNumber='%s' " +
                        "&& classOfFlight='business'",flightDetailed.getFlightNumber())).getInt("cost");
                int economyPrice = crud.doQuery(String.format("SELECT * FROM passengers WHERE flightNumber='%s' " +
                        "&& classOfFlight='economy'",flightDetailed.getFlightNumber())).getInt("cost");
                flightDetailed.setBusinessPrice(businessPrice);
                flightDetailed.setEconomyPrice(economyPrice);

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

    }




    @Override
    public void finalize() throws Throwable {

        super.finalize();
        crud.closeConnection();
    }
}

