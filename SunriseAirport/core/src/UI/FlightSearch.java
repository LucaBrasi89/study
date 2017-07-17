package UI;

import BL.Flight;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by andrew on 17.07.17.
 */
public class FlightSearch implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



    public void fillArrivalTable() {

        ObservableList<Flight> flights = FXCollections.observableArrayList();

        for (Flight flight : ff.getArrivals()) {
//            System.out.println(flight);
            flights.add(flight);
        }

    }
}
