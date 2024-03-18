package view;

import controler.LoginControler;
import controler.UserAcountControler;
import controlerView.LoginWindowControler;
import controlerView.RegisterWindowControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterView extends Application {

    public UserAcountControler userAcountControler;

    public RegisterView(UserAcountControler userAcountControler) {
        this.userAcountControler = userAcountControler;
    }

    @Override
    public void start(Stage stage) throws IOException {
        userAcountControler.chargeUsersReadFile("users");

        // Muestra la ventana principal
        FXMLLoader fxmlLoader = new FXMLLoader(RegisterView.class.getResource("RegisterViewWindow.fxml"));
        RegisterWindowControler registerWindowControler = new RegisterWindowControler(userAcountControler);
        fxmlLoader.setController(registerWindowControler);

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Registro Usuarios");
        stage.setScene(scene);
        stage.show();
    }
}
