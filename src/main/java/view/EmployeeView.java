package view;

import controler.GymControler;
import controler.LoginControler;
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
    public LoginControler loginControler;
    private GymControler gymControler;

    public EmployeeView(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {
        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;
    }

    @Override
    public void start(Stage stage) throws IOException {
        userAcountControler.chargeUsersReadFile("users");
       
        FXMLLoader fxmlLoader = new FXMLLoader(EmployeeView.class.getResource("EmployeeViewWindow.fxml"));
        EmployeeWindowControler employeeWindowControler = new EmployeeWindowControler(userAcountControler, loginControler, gymControler);

        fxmlLoader.setController(employeeWindowControler);

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 615, 415);

        stage.setTitle("Menu Empleado");
        stage.setScene(scene);
        stage.show();

    }
}
