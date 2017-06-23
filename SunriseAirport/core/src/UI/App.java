package UI;

import DL.CRUD;
import DL.FetchFlights;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

/**
 * Created by andrew on 22.06.17.
 */

public class App extends Application {

    public static void main(String[] args) throws ClassNotFoundException {

        launch();

        FetchFlights ff = new FetchFlights();
        System.out.println(ff.getArrivals());
    }



    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Sunrise");
        primaryStage.show();


    }
}
