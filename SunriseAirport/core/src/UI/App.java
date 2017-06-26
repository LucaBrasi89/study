package UI;

import BL.Flight;
import DL.CRUD;
import DL.FetchFlights;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.sql.SQLException;

/**
 * Created by andrew on 22.06.17.
 */

public class App extends Application {

    public static FetchFlights ff;

    public static void main(String[] args) throws ClassNotFoundException {

        ff = new FetchFlights();
        launch();


        System.out.println(ff.getArrivals());
    }



    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setScene(new Scene(root));
        ObservableList<Flight> flights = FXCollections.observableArrayList();

        for (Flight flight : ff.getArrivals()) {
            System.out.println(flight);
            flights.add(flight);
        }

        System.out.println(flights);

        TableView arrivalTable = (TableView) root.lookup("#arrivalTable");

        arrivalTable.setItems(flights);


        primaryStage.setTitle("Sunrise");
        primaryStage.show();


    }
}
