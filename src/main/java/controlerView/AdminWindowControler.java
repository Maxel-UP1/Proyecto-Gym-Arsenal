package controlerView;

import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AdminWindowControler {


    public Button btnModifyFinance;
    public Button btnGoBack;
    public Button btnShowFinance;
    public Button btnModifyInfoGym;
    public Label labelNameAdmin;
    public AdminWindowControler(UserAcountControler userAcountControler){}
    public UserAcountControler userAcountControler;
    public void modifyFinance(ActionEvent actionEvent) {
        this.userAcountControler = userAcountControler;
    }

    public void goBack(ActionEvent actionEvent) {

    }

    public void showFinance(ActionEvent actionEvent) {

    }

    public void modifyInfoGym(ActionEvent actionEvent) {

    }
}
