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
    private TypeOfFlight typeOfFlight;


    public Flight(String flight, String airport, String time, char terminal, String status, TypeOfFlight typeOfFlight) {

        this.flight = flight;
        this.airport = airport;
        this.time = time;
        this.terminal = terminal;
        this.status = status;
        this.typeOfFlight = typeOfFlight;
    }

    public Object[] toArray() throws ClassNotFoundException, NoSuchMethodException {

        Class fligthClass =Class.forName("BL.Flight");
        Constructor[] constructors = fligthClass.getDeclaredConstructors();
        int constrParams = constructors[0].getParameterCount();
        Object[] flightArr = new Object[constrParams];


        flightArr[0] = (Object) flight;
        flightArr[1] = (Object) airport;
        flightArr[2] = (Object) time;
        flightArr[3] = (Object) terminal;
        flightArr[4] = (Object) status;
        flightArr[5] = (Object) typeOfFlight;


        return flightArr;




    }
}
