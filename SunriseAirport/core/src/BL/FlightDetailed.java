package BL;

/**
 * Created by andrew on 16.06.17.
 */
public class FlightDetailed {

    private String flightNumber;
    private String airportName;
    private String time;
    private String typeOfFlight;
    private int economyPassengersCount;
    private int businessPassengersCount;
    private int economyPrice;
    private int businessPrice;

    public FlightDetailed(String flightNumber, String airportName, String time, String typeOfFlight,
                          int economyPassengersCount, int businessPassengersCount, int economyPrice, int businessPrice) {
        this.flightNumber = flightNumber;
        this.airportName = airportName;
        this.time = time;
        this.typeOfFlight = typeOfFlight;
        this.economyPassengersCount = economyPassengersCount;
        this.businessPassengersCount = businessPassengersCount;
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

    public int getEconomyPassengersCount() {
        return economyPassengersCount;
    }

    public void setEconomyPassengersCount(int economyPassengersCount) {
        this.economyPassengersCount = economyPassengersCount;
    }

    public int getBusinessPassengersCount() {
        return businessPassengersCount;
    }

    public void setBusinessPassengersCount(int businessPassengersCount) {
        this.businessPassengersCount = businessPassengersCount;
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
}
