package controlerView;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;

public class EmployeeWindowControler {

    JOptionPane jp;
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
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void seeProfit(ActionEvent actionEvent) {


    }

    public void seeWorkedHours(ActionEvent actionEvent) {
        //ver las horas del usuario
        userAcountControler.chargeUsersReadFile("users");
        int workedHours = userAcountControler.userById(loginControler.getUserLogged().getId()).getHorasTrabajadas();

        jp.showMessageDialog(null, "Sus horas trabajdas Fueron: " + workedHours , "SUCESS!!", jp.INFORMATION_MESSAGE );

        //String hoursToSet = jp.showInputDialog(null, "Ingrese la cantidad de horas trabajadas por: \n" + infoPerosnById , "ASIGNAR HORAS ", jp.QUESTION_MESSAGE);



    }
}
