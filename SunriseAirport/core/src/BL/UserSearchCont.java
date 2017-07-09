package BL;

import DL.FetchPassengers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by andrew on 03.07.17.
 */
public class UserSearchCont implements Initializable {


    @FXML
    private TextField nameField;

    @FXML
    private TextField portField;

    @FXML
    private TextField passportField;

    @FXML
    private TableView passengersTable;

    @FXML
    private ToggleGroup searchingKey;


    private FetchPassengers fp;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fp = new FetchPassengers();
        fillPassengersTable();

        passengersTable.setOnMousePressed(event -> {
            if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
                System.out.println(passengersTable.getSelectionModel().getSelectedItem());
            }
        });



    }




//    starting to fill the table when one appear
    public void fillPassengersTable() {

        ObservableList<Passenger> flights = FXCollections.observableArrayList();

        for (Passenger passenger : fp.getAllPassengers()) {
            System.out.println(passenger);
            flights.add(passenger);
        }

        passengersTable.setItems(flights);
    }


//    running to refill table. Do it with sorting results
    public void refillPassengerTable() {


//        getting a searchingKey
            RadioButton selectedRadBtn = (RadioButton) searchingKey.getSelectedToggle();
            String filterKey = selectedRadBtn.getText().toString();
            String filterValue;
            if (filterKey.equals("name")) {
                filterValue = nameField.getText();
            } else if (filterKey.equals("port")) {
                filterValue = portField.getText();
            } else {
                filterValue = passportField.getText();
            }

        ObservableList<Passenger> flights = FXCollections.observableArrayList();
        List<Passenger> filteredPassList = fp.getFilteredPassengers(filterKey, filterValue);

        for (Passenger passenger : filteredPassList ) {

            flights.add(passenger);
        }

        passengersTable.setItems(flights);
    }


}




