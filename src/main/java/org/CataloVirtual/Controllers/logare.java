package org.CataloVirtual.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.CataloVirtual.Exceptions.ExceptieErrorParolaNume;
import org.CataloVirtual.Main;

import java.io.IOException;

public class logare {

    @FXML
    private Text mesajInregistrare;
    @FXML
    private PasswordField parolaUtilizator;
    @FXML
    private TextField usernameUtilizator;




    @FXML
    public void handleLogareAction() throws Exception {
        /*try {
            //Main.setRoot("register");
            mesajInregistrare.setText("Contul a fost creat cu succes!");
        } catch (ExceptieErrorParolaNume e) {
            mesajInregistrare.setText(e.getMessage());
        }*/
    }
}
