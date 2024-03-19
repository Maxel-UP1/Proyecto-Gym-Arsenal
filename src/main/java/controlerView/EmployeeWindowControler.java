package controlerView;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EmployeeWindowControler {

    public UserAcountControler userAcountControler;
    public LoginControler loginControler;
    private GymControler gymControler;

    public EmployeeWindowControler(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {
        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;
    }
    public Button btnBack;
    public Label txtNameEmployee;
    public Button btnProfit;
    public Button btnHourWorked;

    public void goBack(ActionEvent actionEvent) {

    }

    public void seeProfit(ActionEvent actionEvent) {


    }

    public void seeWorkedHours(ActionEvent actionEvent) {


    }
}
