package BL;

import DL.FetchFlights;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by andrew on 22.06.17.
 */
public class MainWindowContr implements Initializable {

    public FetchFlights ff = new FetchFlights();

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab arrivalTab;

    @FXML
    private Tab depatureTab;

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
    private TextField searchByAirport;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fillArrivalTable();
        fillDepatureTable();

//        define a behaviour for quick search TextFields
        searchByFlight.addEventFilter(KeyEvent.KEY_RELEASED, e -> {
            searchByAirport.clear();
            qSearchByFlight();
        });

        searchByAirport.addEventFilter(KeyEvent.KEY_RELEASED, e -> {
            searchByFlight.clear();
            qSearhByAiportName();
        });

        /* assign a behaviour for arrival and depature tabs. Clearing field for no-frozing
        showing results */
        arrivalTab.selectedProperty().addListener((InvalidationListener) (ov) -> {
            searchByFlight.clear();
            fillArrivalTable();
        });
        arrivalTab.selectedProperty().addListener((InvalidationListener) (ov) -> {
            searchByAirport.clear();
            fillDepatureTable();
        });



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

//          showing menu and hide sidebar
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

//    searching and filter values by flight. Show any occurrences if happen
    public void qSearchByFlight() {

        String activeTab = tabPane.getSelectionModel().getSelectedItem().getId();
        String fieldVal = searchByFlight.getText();

        ObservableList<Flight> flights = FXCollections.observableArrayList();

        for (Flight flight : ff.getFiltFlByAbbr(fieldVal, activeTab)) {

            flights.add(flight);
        }
        if (activeTab.equals("arrival")) {
            arrivalTable.setItems(flights);
        } else if (activeTab.equals("depature")) {
            depatureTable.setItems(flights);
        }

    }


    //    searching and filter values by airportName. Show any occurrences if happen
    public void qSearhByAiportName() {


        String activeTab = tabPane.getSelectionModel().getSelectedItem().getId();
        String fieldVal = searchByAirport.getText();
        System.out.println(activeTab + "___" + fieldVal);

        ObservableList<Flight> flights = FXCollections.observableArrayList();

        for (Flight flight : ff.getFiltFlByAirport(fieldVal, activeTab)) {

            flights.add(flight);
        }
        if (activeTab.equals("arrival")) {
            arrivalTable.setItems(flights);
        } else if (activeTab.equals("depature")) {
            depatureTable.setItems(flights);
        }



    }


    public void userSearchWin() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/UI/UserSearch.fxml"));
        Stage userSearchWin = new Stage();

        userSearchWin.setScene(new Scene(root));
        userSearchWin.setTitle("User search window");
        userSearchWin.show();


    }
}
