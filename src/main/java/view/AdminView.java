package view;

import controler.LoginControler;
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
    private LoginControler loginControler;

    public AdminView(UserAcountControler userAcountControler, LoginControler loginControler) {

        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
    }

    //@Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(AdminView.class.getResource("AdminViewWindow.fxml"));
        AdminWindowControler adminWindowControler = new AdminWindowControler(userAcountControler, loginControler );
        fxmlLoader.setController(adminWindowControler);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 601, 401);

        stage.setTitle("Menu ADMIN");
        stage.setScene(scene);
        adminWindowControler.showNameUserLoged();
        stage.show();

    }

}
