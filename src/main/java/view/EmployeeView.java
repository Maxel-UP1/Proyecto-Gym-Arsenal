package view;

import controler.UserAcountControler;
import controlerView.EmployeeWindowControler;
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
       
        FXMLLoader fxmlLoader = new FXMLLoader(EmployeeView.class.getResource("EmployeeViewWindow.fxml"));
        EmployeeWindowControler employeeWindowControler = new EmployeeWindowControler(userAcountControler);

        fxmlLoader.setController(employeeWindowControler);

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 615, 415);

        stage.setTitle("Menu Empleado");
        stage.setScene(scene);
        stage.show();
    }
}
