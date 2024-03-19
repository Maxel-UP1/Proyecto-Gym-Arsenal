package controlerView;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import view.*;

import java.io.IOException;

public class AdminWindowControler {


    public Button btnModifyFinance;
    public Button btnGoBack;
    public Button btnShowFinance;
    public Button btnModifyInfoGym;
    public Button btnSeeGym;
    public Label labelNameAdmin;
    public UserAcountControler userAcountControler;
    private LoginControler loginControler;
    private GymControler gymControler;

    public AdminWindowControler(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {

        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;
    }


    public void modifyFinance(ActionEvent actionEvent) throws IOException {
        AdminModifyFinanceView adminModifyFinanceView = new AdminModifyFinanceView(userAcountControler, loginControler, gymControler);
        adminModifyFinanceView.start(new Stage());


    }
    public void showNameUserLoged(){
        labelNameAdmin.setText("Bienvenido Admin: " + loginControler.getUserLogged().getName());


    }


    public void goBack(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void showFinance(ActionEvent actionEvent) throws IOException {

        AdminSeeEarningView adminSeeEarningView = new AdminSeeEarningView(userAcountControler, loginControler, gymControler);
        adminSeeEarningView.start(new Stage());

    }

    public void modifyInfoGym(ActionEvent actionEvent) throws IOException {
        AdminModifyGymValuesView adminModifyGymValuesView = new AdminModifyGymValuesView(gymControler);
        adminModifyGymValuesView.start(new Stage());


    }
    public void seeGym(ActionEvent actionEvent) throws IOException {
        AdminSeeInfoGymView adminSeeInfoGymView = new AdminSeeInfoGymView(userAcountControler,loginControler,gymControler);
        adminSeeInfoGymView.start(new Stage());
    }

}
