package controlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ui.HelloApplication;

import java.io.IOException;
import java.util.Objects;

public class LoginWindowControler {


    public Button btnAcces;
    public PasswordField txtPassword;
    public TextField txtUser;
    public Button btnCreateUser;

    Stage holaWindowStage = new Stage();

    public void clicSignIn(ActionEvent actionEvent) throws IOException {
        //aqui empiza la logica de inicar
        
        //llamo a la otra ventana
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hola.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 550);
        holaWindowStage.setTitle("Finazas GYM Arsenal");
        holaWindowStage.setScene(scene);
        holaWindowStage.show();


    }


    public void clicSignUp(ActionEvent actionEvent) {
        
        
        
    }
}
