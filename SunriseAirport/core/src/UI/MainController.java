package UI;

import BL.Flight;
import DL.FetchFlights;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by andrew on 22.06.17.
 */
public class MainController implements Initializable {

    public FetchFlights ff = new FetchFlights();
    ;

    @FXML
    private TableView arrivalTable;

    @FXML
    private TableView depatureTable;

    @FXML
    private MenuBar rootMenu;

    @FXML
    private TextField loginInput;

    @FXML
    private PasswordField passwdInput;

    @FXML
    private VBox sidebar;

    @FXML
    private TextField searchByFlight;

    @FXML
    private TextField searchByTime;

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


    public void quitRoot(ActionEvent actionEvent) {

        loginInput.clear();
        passwdInput.clear();
        rootMenu.setVisible(false);
        sidebar.setVisible(true);

    }


    public void chownRoot(ActionEvent actionEvent) {

//        account passed
        if (ifRoot(loginInput.getText(), passwdInput.getText())) {

//          showing meny and hide sidebar
            rootMenu.setVisible(true);
            sidebar.setVisible(false);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hello!");
            alert.setHeaderText("Perfect");
            alert.setContentText("You have logged like personal stuff");
            alert.show();

//            account failed
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Try again...");
            alert.setHeaderText("We are sorry...");
            alert.setContentText("but you are trying to type wrong login or password.");
            alert.show();

        }
    }


    public boolean ifRoot(String user, String passwd) {

        String originUser = "root";
        String originPasswd = "root";
        if (originUser.equals(user) && originPasswd.equals(passwd)) {

            return true;
        } else {

            return false;
        }
    }

    public void closeApp(ActionEvent actionEvent) {

        System.out.println("Quiting");
        Stage stage = (Stage) arrivalTable.getScene().getWindow();
        stage.close();

    }


    public void sendForm(KeyEvent keyEvent) {

        if (keyEvent.getCode() == KeyCode.ENTER) {
            chownRoot((new ActionEvent()));

        }
    }

}
