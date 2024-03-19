package controlerView;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminManageFinanceWindoControler {


    public TextField txtCustomers;
    public Button btnAddHoursById;
    public Button btnGoBack;
    public Button btnSave;
    public Label labelEmploys;

    public UserAcountControler userAcountControler;
    private LoginControler loginControler;
    private GymControler gymControler;

    public AdminManageFinanceWindoControler(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {

        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;
    }



    public void addHoursByID(ActionEvent actionEvent) {

    }

    public void goBack(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void saveMembersPay(ActionEvent actionEvent) {



    }


}
