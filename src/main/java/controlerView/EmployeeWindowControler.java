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
        double salario = userAcountControler.userById(loginControler.getUserLogged().getId()).getHorasTrabajadas()* gymControler.getArsenalGYM().getValueWorkedWour();
        String name =  loginControler.getUserLogged().getName() + " " + loginControler.getUserLogged().getLastName();
        String profit = "Horas Trabajadas: " + userAcountControler.userById(loginControler.getUserLogged().getId()).getHorasTrabajadas() + "\n" +
                "Tarifa por Hora: $" + gymControler.getArsenalGYM().getValueWorkedWour() + "\n" +
                "Salario Bruto: $" + salario + "\n" +
                "Salario Neto(-I.V.A): $" + (salario - (salario * 0.19 ));

        jp.showMessageDialog(null, "Señor: " + name  + "\nSu pago por Trabajo" +  profit , "GANANCIAS", jp.INFORMATION_MESSAGE );

    }

    public void seeWorkedHours(ActionEvent actionEvent) {
        //ver las horas del usuario
        String mesgOpcional ="";
        userAcountControler.chargeUsersReadFile("users");
        int workedHours = userAcountControler.userById(loginControler.getUserLogged().getId()).getHorasTrabajadas();
        if (workedHours == 0){mesgOpcional = "Horas 0 Contacte un ADMINISTRADOR!!!";}

        jp.showMessageDialog(null, "Sus horas trabajdas Fueron: " + workedHours + "\n" + mesgOpcional , "SUCESS!!", jp.INFORMATION_MESSAGE );

        //String hoursToSet = jp.showInputDialog(null, "Ingrese la cantidad de horas trabajadas por: \n" + infoPerosnById , "ASIGNAR HORAS ", jp.QUESTION_MESSAGE);



    }
}
