package DL;

import BL.Flight;
import BL.TypeOfFlight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by andrew on 16.06.17.
 */
public class FetchFlights {

    public static Flight[][] getArrivals() {

        List<Flight> flightsList = new ArrayList<Flight>();
        flightsList.add(new Flight("TK 460","Heathrow Airport","12:42",'A',"Arrived", TypeOfFlight.ARRIVAL));
        flightsList.add(new Flight("7W 7082","Barcelona","17:39",'B',"Arrived", TypeOfFlight.ARRIVAL));
        flightsList.add(new Flight("CN S041","Humburg","12:87",'B',"-", TypeOfFlight.ARRIVAL));

        Flight[][] flightArr = new Flight[flightsList.size()][6];

        for (int i = 0; i < flightArr.length-1; i++) {
            flightArr[i] = flightsList.get(i);
        }


        return (Flight[][]) flightsList.toArray();
    }





}
