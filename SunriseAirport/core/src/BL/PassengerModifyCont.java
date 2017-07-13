package BL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by andrew on 13.07.17.
 */
public class PassengerModifyCont implements Initializable {

    @FXML
    private TextField flightNumberTField;

    @FXML
    private TextField firstNameTField;

    @FXML
    private TextField lastNameTField;

    @FXML
    private TextField nationalityTField;

    @FXML
    private TextField passportTField;

    @FXML
    private TextField birthdayTField;

    @FXML
    private ChoiceBox genderChBox;

    @FXML
    private ChoiceBox classChBox;

    private ObservableList<String> genderChoicesList =
            FXCollections.observableArrayList("male", "female");

    private ObservableList<String> classChoicesList =
            FXCollections.observableArrayList("economy", "business");

    @Override
    public void initialize(URL location, ResourceBundle resources) {

//        initialize gender choice box
        genderChBox.setItems(genderChoicesList);
        genderChBox.setValue("male");

//        initialize class choice box
        classChBox.setItems(classChoicesList);
        classChBox.setValue("business");


        if (PassengerContext.getInstance().getActionState().equals("add")) {

            System.out.println("inserting mode");
            clearFields();
        } else {
//                  System.out.println("editing mode");
            System.out.println(PassengerContext.getInstance().getPsngr());
            predefineValues(PassengerContext.getInstance().getPsngr());


        }

    }


    //    for cancel button
    public void closeWind(ActionEvent actionEvent) {

        System.out.println("\nclosing PassengerModify window\n");
        Stage stage = (Stage) firstNameTField.getScene().getWindow();
        stage.close();

    }

    //    predefine fields with values from selected passenger item. Just for convenience.
//    Raise NullPointer if item was not selected.
    public void predefineValues(Passenger psngr) {

        if (psngr == null) {
            throw new NullPointerException();
        }
        flightNumberTField.setText(psngr.getFlightNumber());
        firstNameTField.setText(psngr.getFirstName());
        lastNameTField.setText(psngr.getLastName());
        nationalityTField.setText(psngr.getNationality());
        passportTField.setText(psngr.getPassport());
        birthdayTField.setText(psngr.getBirthday());
        genderChBox.setValue(psngr.getGender());
        classChBox.setValue(psngr.getClassOfFlight());
    }

    public void clearFields() {

        flightNumberTField.clear();
        firstNameTField.clear();
        lastNameTField.clear();
        nationalityTField.clear();
        passportTField.clear();
        birthdayTField.clear();
        genderChBox.setValue("male");
        classChBox.setValue("business");
    }


}
