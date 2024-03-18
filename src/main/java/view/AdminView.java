package view;

import controler.UserAcountControler;
import controlerView.AdminWindowControler;
import controlerView.EmployeeWindowControler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminView {


    public UserAcountControler userAcountControler;

    public AdminView(UserAcountControler userAcountControler) {
        this.userAcountControler = userAcountControler;
    }

    //@Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(AdminView.class.getResource("AdminViewWindow.fxml"));
        AdminWindowControler adminWindowControler = new AdminWindowControler(userAcountControler);
        fxmlLoader.setController(adminWindowControler);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 601, 401);

        stage.setTitle("Menu ADMIN");
        stage.setScene(scene);
        stage.show();

    }

}
