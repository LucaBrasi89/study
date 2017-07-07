package BL;

import DL.FetchPassengers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by andrew on 03.07.17.
 */
public class UserSearchCont implements Initializable {

    private String nameInpVal;
    private String genderInpVal;
    private String passportInpVal;

    @FXML
    private TextField nameField;

    @FXML
    private TextField genderField;

    @FXML
    private TextField passportField;

    @FXML
    private TableView passengersTable;

    private FetchPassengers fp;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fp = new FetchPassengers();
        fillPassengersTable();

    }


////    TOGGLERS FOR FIELDS
//
//    public void toggleNameField(ActionEvent actionEvent) {
//
//        System.out.println(nameField.isEditable());
//        if (!nameField.isDisable()) {
//            nameField.setDisable(true);
//        } else {
//            nameField.setDisable(false);
//        }
//
//    }
//
//
//    public void toggleGenderBox(ActionEvent actionEvent) {
//
//
//        if (!genderBox.isDisable()) {
//            genderBox.setDisable(true);
//
//        } else {
//            genderBox.setDisable(false);
//        }
//
//    }
//
//    public void togglePassportField(ActionEvent actionEvent) {
//
//
//        if (!passportField.isDisable()) {
//            passportField.setDisable(true);
//
//        } else {
//            passportField.setDisable(false);
//        }
//
//    }


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
        getFieldValues();

        ObservableList<Passenger> flights = FXCollections.observableArrayList();
        List<Passenger> filteredPassList = fp.getFilteredPassengers(nameInpVal, genderInpVal, passportInpVal);

        for (Passenger passenger : filteredPassList ) {
            System.out.println(passenger);
            flights.add(passenger);
        }

        passengersTable.setItems(flights);
    }

    /* helps to get following a values from sending form:
    nameField, genderField, passportField/
     If someone from inputs disable assign it null
     */
    public void  getFieldValues() {



    }



}




