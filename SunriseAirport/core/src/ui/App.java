package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by andrew on 22.06.17.
 * <p>
 * Application starts to work from this file.
 * MAIN method runs GUI and showing MainWindow.
 */

public class App extends Application {

    public static void main(String[] args) throws ClassNotFoundException {

        launch();

    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../resources/fxml/MainWindow.fxml"));
        primaryStage.setScene(new Scene(root));

        primaryStage.setTitle("Sunrise");
        primaryStage.show();

    }
}
