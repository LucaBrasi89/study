package BL;

/**
 * Created by andrew on 16.06.17.
 */
public class FlightDetailed {

    private String flightNumber;
    private String airportName;
    private String time;
    private String typeOfFlight;
    private int economyPsngrCount;
    private int businessPsngrCount;
    private int economyPrice;
    private int businessPrice;


    public FlightDetailed(String flightNumber, String airportName, String time, String typeOfFlight,
                          int economyPsngrCount, int businessPsngrCount, int economyPrice, int businessPrice) {
        this.flightNumber = flightNumber;
        this.airportName = airportName;
        this.time = time;
        this.typeOfFlight = typeOfFlight;
        this.economyPsngrCount = economyPsngrCount;
        this.businessPsngrCount = businessPsngrCount;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
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

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeOfFlight() {
        return typeOfFlight;
    }

    public void setTypeOfFlight(String typeOfFlight) {
        this.typeOfFlight = typeOfFlight;
    }

    public int getEconomyPsngrCount() {
        return economyPsngrCount;
    }

    public void setEconomyPsngrCount(int economyPsngrCount) {
        this.economyPsngrCount = economyPsngrCount;
    }

    public int getBusinessPsngrCount() {
        return businessPsngrCount;
    }

    public void setBusinessPsngrCount(int businessPsngrCount) {
        this.businessPsngrCount = businessPsngrCount;
    }

    public int getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(int economyPrice) {
        this.economyPrice = economyPrice;
    }

    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }

    public String getRoute() {

        String route;
        if (typeOfFlight.equals("ARRIVAL")) {
            route = airportName + " - Sunrise";
        } else {
            route = "Sunrise - " + airportName;
        }
        return route;

    }

    public int getSumPsngrCount() {

        return (economyPsngrCount + businessPsngrCount);
    }

    @Override
    public String toString() {
        return "FlightDetailed { " +
                "flightNumber='" + flightNumber + '\'' +
                ", airportName='" + airportName + '\'' +
                ", time='" + time + '\'' +
                ", typeOfFlight='" + typeOfFlight + '\'' +
                ", economyPsngrCount=" + economyPsngrCount +
                ", businessPsngrCount=" + businessPsngrCount +
                ", economyPrice=" + economyPrice +
                ", businessPrice=" + businessPrice +
                '}';
    }
}
