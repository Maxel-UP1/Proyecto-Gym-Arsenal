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

import javax.swing.*;

public class AdminManageFinanceWindoControler {


    public TextField txtCustomers;
    public Button btnAddHoursById;
    public Button btnGoBack;
    public Button btnSave;
    public Label labelEmploys;
    public Label labelInfoMesagueClients;

    public UserAcountControler userAcountControler;
    private LoginControler loginControler;
    private GymControler gymControler;
    private JOptionPane jp;

    public AdminManageFinanceWindoControler(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {

        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;
    }



    public void addHoursByID(ActionEvent actionEvent) {
        String IdSearch = jp.showInputDialog(null, "Ingrese el Id del empelado" , "ASIGNAR HORAS", jp.QUESTION_MESSAGE);
        String infoPerosnById = userAcountControler.nameById(IdSearch);
        if (infoPerosnById == null){
            jp.showMessageDialog(null, "Error, ID No se econtro o no Existe", "ERROR !!", jp.ERROR_MESSAGE );

        }else {
            String hoursToSet = jp.showInputDialog(null, "Ingrese la cantidad de horas trabajadas por: \n" + infoPerosnById , "ASIGNAR HORAS ", jp.QUESTION_MESSAGE);

            if (Integer.parseInt(hoursToSet) < 240){
                userAcountControler.configueWorkedHoursById(IdSearch, Integer.parseInt(hoursToSet));
            }else { jp.showMessageDialog(null, "Error, Demasiadas horas para un Mes", "ERROR !!", jp.ERROR_MESSAGE );}

        }






    }

    public void goBack(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void saveMembersPay(ActionEvent actionEvent) {
        boolean goodNumber = true;
        if(txtCustomers.getText().isEmpty() ){
            labelInfoMesagueClients.setText("VACIO!!");
            goodNumber = false;
        }
        if (Integer.parseInt(txtCustomers.getText()) > 300){
            labelInfoMesagueClients.setText("No valido");
            goodNumber = false;
        }

        if (goodNumber){
            gymControler.getArsenalGYM().setNumeberMembersPay(Integer.parseInt(txtCustomers.getText()));
            labelInfoMesagueClients.setText("HECHO!!");
        }

    }

    public void showNameEmployes(){
        labelEmploys.setText(userAcountControler.infoEmployes());
        txtCustomers.setText("1");



    }


}
