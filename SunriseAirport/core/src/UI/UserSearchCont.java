package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import java.awt.*;

/**
 * Created by andrew on 03.07.17.
 */
public class UserSearchCont {

    @FXML
    private Checkbox nameBox;

    @FXML
    private TextField nameField;

    @FXML
    private TextField genderField;

    @FXML
    private TextField passportField;




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
    

}
