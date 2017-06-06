package BL;

import java.util.List;

/**
 * Created by andrew on 05.06.17.
 */
public interface BusinessLogic {

    public List viewArrivalS();

    public List viewDepatures();

    public List viewPriceList(String flight);

    public List<Passenger> viewPassengerList();

    public List flightNumber();

    public List findByName(String firstName, String secondName);


}
