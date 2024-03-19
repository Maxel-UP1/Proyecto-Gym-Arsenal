package view;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import controlerView.AdminManageFinanceWindoControler;
import controlerView.AdminModifyGymValuesWindowControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminModifyGymValuesView extends Application {

    private GymControler gymControler;

    public AdminModifyGymValuesView(GymControler gymControler) {

        this.gymControler = gymControler;
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AdminModifyFinanceView.class.getResource("AdminModifyGymValuesWindow.fxml"));

        AdminModifyGymValuesWindowControler adminModifyGymValuesWindowControler = new AdminModifyGymValuesWindowControler(gymControler);

        fxmlLoader.setController(adminModifyGymValuesWindowControler);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Modificar Informacion del Gym");
        stage.setScene(scene);
        stage.show();
    }
}
