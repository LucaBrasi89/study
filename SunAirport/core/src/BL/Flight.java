package BL;

/**
 * Created by andrew on 16.06.17.
 */
public class Flight {

    private String flight;
    private String airport;
    private String time;
    private char terminal;
    private String status;
    private TypeOfFlight typeOfFlight;

    public Flight(String flight, String airport, String time, char terminal, String status, TypeOfFlight typeOfFlight) {

        this.flight = flight;
        this.airport = airport;
        this.time = time;
        this.terminal = terminal;
        this.status = status;
        this.typeOfFlight = typeOfFlight;
    }
}
