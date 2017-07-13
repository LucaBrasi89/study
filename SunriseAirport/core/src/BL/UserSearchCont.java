package BL;

import DL.FetchPassengers;
import DL.ModifyPassengers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
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
    // stack with changed passengers
    private Queue<Integer> changedPsngrsStack = new ArrayDeque<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fp = new FetchPassengers();
        fillPassengersTable();

        passengersTable.setOnMousePressed(event -> {
            if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {

                changedPsngrsStack.add(passengersTable.getSelectionModel().getSelectedIndex());

            }
        });

    }


    //    starting to fill the table when one appear
    public void fillPassengersTable() {

        ObservableList<Passenger> flights = FXCollections.observableArrayList();

        for (Passenger passenger : fp.getAllPassengers()) {

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

        for (Passenger passenger : filteredPassList) {

            flights.add(passenger);
        }

        passengersTable.setItems(flights);
    }


    //    refill table and clear searching fields fields
    public void discardChanges(ActionEvent actionEvent) {

        fillPassengersTable();
        nameField.clear();
        portField.clear();
        passportField.clear();
        System.out.println("\nDISCARD CHANGES\n");

    }

    //    updating passengers from stack of changes
    public void savePassengersTable() {

        passengersTable.refresh();
        ModifyPassengers mp = new ModifyPassengers();
        for (int psngrIndex : changedPsngrsStack) {
            Passenger psngr = (Passenger) passengersTable.getItems().get(psngrIndex);
            mp.updatePassenger(psngr);
        }

    }


    //    invoking window for add new passengers
    public void passengerAddWin() throws IOException {

//      set "add" mode
        PassengerContext.getInstance().setActionState("add");

        Parent root = FXMLLoader.load(getClass().getResource("/UI/PassengerModify.fxml"));
        Stage psngrModifyWin = new Stage();
        psngrModifyWin.setScene(new Scene(root));
        psngrModifyWin.setTitle("Modify passenger data");
        psngrModifyWin.show();
    }

    //    invoking window to edit passengers
    public void passengerEditWin() throws IOException {

//        get selected item for editing in table and set "edit" mode

        Passenger selectedPsngr = (Passenger) passengersTable.getSelectionModel().getSelectedItem();
        if (selectedPsngr == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("select table item");
            alert.setHeaderText(null);
            alert.setContentText("Please, select item before editing ");
            alert.show();
        } else {
            PassengerContext.getInstance().setPsngr(selectedPsngr);
            PassengerContext.getInstance().setActionState("edit");

            Parent root = FXMLLoader.load(getClass().getResource("/UI/PassengerModify.fxml"));
            Stage psngrModifyWin = new Stage();
            psngrModifyWin.setScene(new Scene(root));
            psngrModifyWin.setTitle("Modify passenger data");

            psngrModifyWin.show();
        }
    }

    //    for cancel button
    public void closeWind(ActionEvent actionEvent) {

        System.out.println("\nclosing UserSearchWindow\n");
        Stage stage = (Stage) nameField.getScene().getWindow();
        stage.close();

    }


}




