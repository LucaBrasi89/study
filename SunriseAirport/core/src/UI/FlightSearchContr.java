package UI;

import BL.Flight;
import BL.FlightDetailed;
import DL.FetchFlightsDetailed;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by andrew on 17.07.17.
 */
public class FlightSearchContr implements Initializable {

    @FXML
    public TableView flightsTable;

    @FXML
    public TextField searchByFlight;

    private List<FlightDetailed> flightsDetailed = new ArrayList<FlightDetailed>();
    private FetchFlightsDetailed ffd = new FetchFlightsDetailed();



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        showAllFlights();

        //        define a behaviour for quick search TextFields
        searchByFlight.addEventFilter(KeyEvent.KEY_RELEASED, e -> {

            qSearchByFlight();
        });

    }


    private void showAllFlights() {

        ObservableList<FlightDetailed> flights = FXCollections.observableArrayList();
        for (FlightDetailed flight : ffd.getFlightsDetailed()) {
            flights.add(flight);
        }
        flightsTable.setItems(flights);

    }


    private void qSearchByFlight() {

        ObservableList<FlightDetailed> flights = FXCollections.observableArrayList();
        String inputText = searchByFlight.getText();
        for (FlightDetailed flight : ffd.getFiltFlight(inputText)) {
            flights.add(flight);
        }
        flightsTable.setItems(flights);

    }

    public void closeApp(ActionEvent actionEvent) {

        System.out.println("Quiting");
        Stage stage = (Stage) flightsTable.getScene().getWindow();
        stage.close();

    }

}






