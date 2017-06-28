package UI;

import BL.Flight;
import DL.FetchFlights;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by andrew on 22.06.17.
 */
public class MainController implements Initializable {

    public FetchFlights ff = new FetchFlights();;

    @FXML
    private TableView arrivalTable;

    @FXML
    private TableView depatureTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fillArrivalTable();
        fillDepatureTable();
    }

    public void fillArrivalTable() {

            ObservableList<Flight> flights = FXCollections.observableArrayList();

            for (Flight flight : ff.getArrivals()) {
                System.out.println(flight);
                flights.add(flight);
            }

            arrivalTable.setItems(flights);
        }



    public void fillDepatureTable() {

        ObservableList<Flight> flights = FXCollections.observableArrayList();

        for (Flight flight : ff.getDepatures()) {
            System.out.println(flight);
            flights.add(flight);
        }

        depatureTable.setItems(flights);
    }


}

