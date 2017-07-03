package BL;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by andrew on 16.06.17.
 */
public class Flight {

    private String flight;
    private String airport;
    private String time;
    private char terminal;
    private String status;
//    private TypeOfFlight typeOfFlight;


    public Flight(String flight, String airport, String time, char terminal, String status) {

        this.flight = flight;
        this.airport = airport;
        this.time = time;
        this.terminal = terminal;
        this.status = status;
//        this.typeOfFlight = typeOfFlight;
    }



    @Override
    public String toString() {
        return "Flight{" +
                "flight='" + flight + '\'' +
                ", airport='" + airport + '\'' +
                ", time='" + time + '\'' +
                ", terminal=" + terminal +
                ", status='" + status + '\'' +
                '}';
    }


    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public char getTerminal() {
        return terminal;
    }

    public void setTerminal(char terminal) {
        this.terminal = terminal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
