package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPassword;

    public void Login (ActionEvent event) throws Exception {
        if (txtUserName.getText().equals("marynka") && txtPassword.getText().equals("halko")) {
            lblStatus.setText("Użytkownik");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }
        else if (txtUserName.getText().equals("bartoni") && txtPassword.getText().equals("siemka")){
            lblStatus.setText("Administrator");
        }
        else {
            lblStatus.setText("Login nieudany :(");
        }

    }

}
