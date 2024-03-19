package view;
import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import controlerView.AdminManageFinanceWindoControler;
import controlerView.AdminSeeEarningsWindowControler;
import controlerView.RegisterWindowControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class AdminSeeEarningView extends Application {

    public UserAcountControler userAcountControler;
    private LoginControler loginControler;
    private GymControler gymControler;

    public AdminSeeEarningView(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {
        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(AdminSeeEarningView.class.getResource("AdminSeeEarningsViewWindow.fxml"));
        AdminSeeEarningsWindowControler adminSeeEarningWindowControler = new AdminSeeEarningsWindowControler(userAcountControler, loginControler, gymControler);
        fxmlLoader.setController(adminSeeEarningWindowControler);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Ver Ganancias del GYM");
        stage.setScene(scene);
        stage.show();
    }
}
