package view;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import controlerView.AdminManageFinanceWindoControler;
import controlerView.RegisterWindowControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminModifyFinanceView extends Application {

    public UserAcountControler userAcountControler;
    private LoginControler loginControler;
    private GymControler gymControler;

    public AdminModifyFinanceView(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {

        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;
    }
    @Override
    public void start(Stage stage) throws IOException {
        userAcountControler.chargeUsersReadFile("users");

        // Muestra la ventana principal
        FXMLLoader fxmlLoader = new FXMLLoader(AdminModifyFinanceView.class.getResource("AdimManageFinanceViewWidow.fxml"));
        AdminManageFinanceWindoControler adminManageFinanceWindoControler = new AdminManageFinanceWindoControler(userAcountControler, loginControler, gymControler);
        fxmlLoader.setController(adminManageFinanceWindoControler);

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Finanzas del GYM");
        stage.setScene(scene);
        stage.show();
    }
}