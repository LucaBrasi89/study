package dl.data;

/**
 * Created by andrew on 13.07.17.
 * <p>
 * Represents a mechanism for shared data between fxml controllers.
 */
public class FlightDetailedContext {

    private final static FlightDetailedContext instance = new FlightDetailedContext();

    public static FlightDetailedContext getInstance() {

        return instance;
    }

    private FlightDetailed flight;

    public FlightDetailed getFlight() {

        return flight;
    }

    public void setFlight(FlightDetailed flight) {

        this.flight = flight;
    }


}
