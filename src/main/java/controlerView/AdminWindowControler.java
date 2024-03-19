package controlerView;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import view.AdminModifyFinanceView;
import view.RegisterView;

import java.io.IOException;

public class AdminWindowControler {


    public Button btnModifyFinance;
    public Button btnGoBack;
    public Button btnShowFinance;
    public Button btnModifyInfoGym;
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

    public void showFinance(ActionEvent actionEvent) {

    }

    public void modifyInfoGym(ActionEvent actionEvent) {

    }
}
