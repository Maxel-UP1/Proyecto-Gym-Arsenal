package controlerView;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginWindowController {


    public Button btnAcces;
    public PasswordField txtPassword;
    public TextField txtUser;
    public Button btnCreateUser;

    Stage holaWindowStage = new Stage();
    Stage adminView = new Stage();
    public void clicSignIn(ActionEvent actionEvent) throws IOException {
        //aqui empiza la logica de inicar




        //llamo a la otra ventana


        /*FXMLLoader fxmlLoader = new FXMLLoader(LoginView.class.getResource("hola.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 550);
        adminView.setTitle("adasd");
        adminView.setScene(scene);
        adminView.show();*/


    }


    public void clicSignUp(ActionEvent actionEvent) {
        
        
        
    }



}
