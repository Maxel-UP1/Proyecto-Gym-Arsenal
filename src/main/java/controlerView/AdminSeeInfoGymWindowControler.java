package controlerView;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Gym;

public class AdminSeeInfoGymWindowControler {


    public Label lblValueMembership;
    public Label lblValueWorkedHour;
    public Label lblRent;
    public Label lblNumberEmployees;
    public Label lblNumberMemershipActive;
    public Button btnSeeInfo;
    public Button btnGoBack;


    private GymControler gymControler;

    public AdminSeeInfoGymWindowControler( GymControler gymControler) {

        this.gymControler = gymControler;
    }

    public void goBack(ActionEvent actionEvent) {
        //como la clase no cuenta con un stage asociado se usa esta forma
        // Obtener el nodo raíz del evento
        Node source = (Node) actionEvent.getSource();
        // Obtener el Stage asociado al nodo raíz
        Stage stage = (Stage) source.getScene().getWindow();
        // Cerrar la ventana
        stage.close();

    }
    public void seeInfo(ActionEvent actionEvent) {

            // Obtener los datos del gimnasio desde GymControler
            Gym arsenalGym = gymControler.getArsenalGYM();

            // Asignar los datos a los labels correspondientes
            lblValueMembership.setText(String.valueOf(arsenalGym.getValueMembership()));
            lblValueWorkedHour.setText(String.valueOf(arsenalGym.getValueWorkedWour()));
            lblRent.setText(String.valueOf(arsenalGym.getRent()));
            lblNumberEmployees.setText(String.valueOf(arsenalGym.getNumberEmployes()));
            lblNumberMemershipActive.setText(String.valueOf(arsenalGym.getNumeberMembersPay()));


    }
}
