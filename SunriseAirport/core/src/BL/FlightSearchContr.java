package BL;

import BL.Flight;
import BL.FlightDetailed;
import BL.FlightDetailedContext;
import DL.FetchFlightsDetailed;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
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

    @FXML
    public ContextMenu contextMenu;

    private List<FlightDetailed> flightsDetailed = new ArrayList<FlightDetailed>();
    private FetchFlightsDetailed ffd = new FetchFlightsDetailed();



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        showAllFlights();

        //        define a behaviour for quick search TextFields
        searchByFlight.addEventFilter(KeyEvent.KEY_RELEASED, e -> {

            qSearchByFlight();
        });



        flightsTable.setOnContextMenuRequested( e -> {

            System.out.println("show details");
            contextMenu.show(flightsTable, e.getScreenX(), e.getScreenY());

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


    public void closeWin() {

        System.out.println("close Flight search window");
        Stage stage = (Stage) flightsTable.getScene().getWindow();
        stage.close();

    }

    public void showDetails() throws IOException {


        FlightDetailedContext fdCon = FlightDetailedContext.getInstance();
        fdCon.setFlight((FlightDetailed) flightsTable.getSelectionModel().getSelectedItem());
        flightDetailedWin();


    }


    public void flightDetailedWin() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/UI/FlightDetailed.fxml"));
        Stage userSearchWin = new Stage();

        userSearchWin.setScene(new Scene(root));
        userSearchWin.setTitle("Look at more details");
        userSearchWin.show();

    }



}






