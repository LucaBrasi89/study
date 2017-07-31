package dl.data;

/**
 * Created by andrew on 16.06.17.
 * <p>
 * Basic data structure for representing information about flightNumber.
 */
public class Flight {

    private String flightNumber;
    private String airportName;
    private String time;
    private char terminal;
    private String status;


    public Flight(String flightName, String airportName, String time, char terminal, String status) {

        this.flightNumber = flightName;
        this.airportName = airportName;
        this.time = time;
        this.terminal = terminal;
        this.status = status;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airportName='" + airportName + '\'' +
                ", time='" + time + '\'' +
                ", terminal=" + terminal +
                ", status='" + status + '\'' +
                '}';
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getTime() {
        return time;
    }

    public char getTerminal() {
        return terminal;
    }

    public String getStatus() {
        return status;
    }

}
