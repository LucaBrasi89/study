package DL;

import BL.Flight;
import javafx.util.converter.DateTimeStringConverter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * Created by andrew on 16.06.17.
 */
public class FetchFlights implements PassengerAction {

    private CRUD crud;
    private List<Flight> arrivalFL;
    private List<Flight> depatureFL;


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

                String time = rs.getString("time");
                String status = generateStatus(time, "ARRIVAL");

                arrivalFL.add(new Flight(rs.getString("flight"),
                        rs.getString("airportName"),
                        time,
                        rs.getString("terminal").charAt(0),
                        status));
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
                String time = rs.getString("time");
                String status = generateStatus(time, "DEPATURE");

                depatureFL.add(new Flight(rs.getString("flight"),
                        rs.getString("airportName"),
                        time,
                        rs.getString("terminal").charAt(0),
                        status));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return depatureFL;
    }

    //    retrun values of flights which sorted by flight abbreviation
    public List<Flight> getFiltFlByAbbr(String charSequence, String typeOfFlight) {

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

    //    retrun values of flights which sorted by abbreviation
    public List<Flight> getFiltFlByAirport(String charSequence, String typeOfFlight) {

        List<Flight> flightsList = null;
        List<Flight> filteredFlightList = new ArrayList<>();
        if (typeOfFlight.equals("arrival")) {
            flightsList = arrivalFL;
        } else if (typeOfFlight.equals("depature")) {
            flightsList = depatureFL;
        }
        for (Flight flight : flightsList) {
            if (flight.getAirportName().contains(charSequence)) {
                filteredFlightList.add(flight);
            }
        }
        return filteredFlightList;
    }


    public String generateStatus(String time, String type) {

        System.out.println(time);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime flightTime = LocalTime.from(LocalTime.parse(time, dtf)) ;


        LocalTime now = LocalTime.now();
        long minutesDiff = ChronoUnit.MINUTES.between(now, flightTime);
        System.out.println(minutesDiff);

        if (minutesDiff >= 20 && minutesDiff <= 120 && type.equals("DEPATURE") ) {
            return "check-in";
        } else if (minutesDiff < 20 && minutesDiff >= 0 && type.equals("DEPATURE")) {
            return "boarding";
        } else  if (minutesDiff < 0 && type.equals("DEPATURE")) {
            return "departed";
        } else if (minutesDiff < 180  && minutesDiff >= 0 && type.equals("ARRIVAL")) {
            Random rand = new Random();
            LocalTime sheduledTime = flightTime.plusMinutes(rand.nextInt(10));
            return "sheduled " + String.valueOf(sheduledTime.getHour()+":"+sheduledTime.getMinute());

        } else if(minutesDiff < 0  && type.equals("ARRIVAL")) {
            return "landed";
        }
        else {
            return "   -   ";
        }
    }

    @Override
    public void finalize() throws Throwable {

        super.finalize();
        crud.closeConnection();
    }
}










