package DL;

import BL.Flight;
import BL.TypeOfFlight;
import javafx.scene.control.TableView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by andrew on 16.06.17.
 */
public class FetchFlights {

    private CRUD crud;

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

    public List<Flight> getArrivals() {

        List<Flight> flightsList = new ArrayList<Flight>();

        try {
            ResultSet rs = crud.doQuery("SELECT * FROM `flights` WHERE `typeOfFlight`='depature'");
            while (rs.next()) {

                flightsList.add(new Flight(rs.getString("flight"),
                        rs.getString("airport"),
                        rs.getString("time"),
                        rs.getString("terminal").charAt(0),
                        rs.getString("status"),
                        TypeOfFlight.valueOf(rs.getString("typeOfFlight"))));


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        crud.closeConnection();
        return flightsList;
    }
}










