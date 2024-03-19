package view;
import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import controlerView.AdminSeeInfoGymWindowControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminSeeInfoGymView extends Application {
    public UserAcountControler userAcountControler;
    public LoginControler loginControler;
    private GymControler gymControler;

    public AdminSeeInfoGymView(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {
        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AdminSeeInfoGymView.class.getResource("AdminSeeInfoGymViewWindow.fxml"));
        AdminSeeInfoGymWindowControler adminSeeInfoGymWindowControler = new AdminSeeInfoGymWindowControler(gymControler);
        fxmlLoader.setController(adminSeeInfoGymWindowControler);

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Información del Gimnasio");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

