package view;

import controler.UserAcountControler;
import controlerView.RegisterWindowControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeView extends Application {

    public UserAcountControler userAcountControler;

    public EmployeeView(UserAcountControler userAcountControler) {
        this.userAcountControler = userAcountControler;
    }

    @Override
    public void start(Stage stage) throws IOException {
       
        FXMLLoader fxmlLoader = new FXMLLoader(EmployeeView.class.getResource("EmployeeView.fxml"));
        
        RegisterWindowControler registerWindowControler = new RegisterWindowControler(userAcountControler);
        fxmlLoader.setController(registerWindowControler);

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Registro Usuarios");
        stage.setScene(scene);
        stage.show();
    }
}
