package UI;

import javax.swing.*;

/**
 * Created by andrew on 17.06.17.
 */
public class FormValidator {

    private JTextField loginField;
    private JPasswordField passField;

    public FormValidator(JTextField loginField, JPasswordField passField) {

        this.loginField = loginField;
        this.passField = passField;
    }

    public void validateForm() {

        if (loginField.getText().equals(passField.getText())) {

            JOptionPane.showMessageDialog(null, "You are successfully logged");

        } else {
            JOptionPane.showMessageDialog(null, "Something wrong happen, please check password");

        }

    }
}
