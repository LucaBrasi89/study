package UI;

import BL.Passenger;
import DL.FetchPassengers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by andrew on 03.07.17.
 */
public class UserSearchCont implements Initializable {



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


    public void toggleNameField(ActionEvent actionEvent) {

        System.out.println(nameField.isEditable());
        if (nameField.isEditable()) {

            nameField.setEditable(false);
            nameField.setStyle("-fx-pref-width: 40; -fx-background-color: beige");

        } else {
            nameField.setEditable(true);
            nameField.setStyle("-fx-pref-width: 40;");
        }

    }


    public void toggleGenderField(ActionEvent actionEvent) {


        if (genderField.isEditable()) {

            genderField.setEditable(false);
            genderField.setStyle("-fx-pref-width: 40; -fx-background-color: beige");

        } else {
            genderField.setEditable(true);
            genderField.setStyle("-fx-pref-width: 40;");
        }

    }

    public void togglePassportField(ActionEvent actionEvent) {


        if (passportField.isEditable()) {

            passportField.setEditable(false);
            passportField.setStyle("-fx-pref-width: 40; -fx-background-color: beige");

        } else {
            passportField.setEditable(true);
            passportField.setStyle("-fx-pref-width: 40;");
        }

    }


    public void fillPassengersTable() {

        ObservableList<Passenger> flights = FXCollections.observableArrayList();

        for (Passenger passenger : fp.getPassengers()) {
            System.out.println(passenger);
            flights.add(passenger);
        }

        passengersTable.setItems(flights);
    }



}
