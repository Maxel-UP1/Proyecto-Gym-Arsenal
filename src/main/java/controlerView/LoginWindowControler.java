package controlerView;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginWindowControler {


    public TextField txtUsername;
    public PasswordField txtPassword;

    public void logIn(ActionEvent actionEvent) {
        //inicia la sesion
        System.out.println("INCIAR SESION");


        //llamo a la otra ventana


        /*FXMLLoader fxmlLoader = new FXMLLoader(LoginView.class.getResource("hola.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 550);
        adminView.setTitle("adasd");
        adminView.setScene(scene);
        adminView.show();*/


    }

    public void SignIn(ActionEvent actionEvent) {

        System.out.println("REGISTRO");

    }


}
