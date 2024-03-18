package controlerView;

import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EmployeeWindowControler {

    public UserAcountControler userAcountControler;
    public EmployeeWindowControler(UserAcountControler userAcountControler ) {
        this.userAcountControler = userAcountControler;
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
