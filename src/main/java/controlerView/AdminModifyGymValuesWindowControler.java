package controlerView;

import controler.GymControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Gym;

public class AdminModifyGymValuesWindowControler {

    public Button btnChangeInfo;
    public TextField txtNewValueMebership;
    public TextField txtNewRent;
    public TextField txtNewName;
    public TextField txtNewWorkedHour;
    public Label lblMessague;
    private GymControler gymControler;
    public Button btnGoBack;



    public void goBack(ActionEvent actionEvent) {
        //como la clase no cuenta con un stage asociado se usa esta forma
        // Obtener el nodo raíz del evento
        Node source = (Node) actionEvent.getSource();
        // Obtener el Stage asociado al nodo raíz
        Stage stage = (Stage) source.getScene().getWindow();
        // Cerrar la ventana
        stage.close();

    }

    public AdminModifyGymValuesWindowControler(GymControler gymControler) {
        this.gymControler = gymControler;
    }

    public void changeInfo(ActionEvent actionEvent) {
        // Obtener los nuevos valores ingresados por el usuario
        String newValueMembershipStr = txtNewValueMebership.getText();
        String newRentStr = txtNewRent.getText();
        String newName = txtNewName.getText();
        String newWorkedHourStr = txtNewWorkedHour.getText();
        String TEMP = "";


        // Validar campos vacíos y establecer valores predeterminados si están vacíos

        // Membresía
        if (newValueMembershipStr.isEmpty()) {
            TEMP = lblMessague.getText();
            lblMessague.setText(TEMP + "Espacio Membresia Vacio");
            newValueMembershipStr = String.valueOf(gymControler.getArsenalGYM().getValueMembership());

        }

        // Renta
        if (newRentStr.isEmpty()) {
            TEMP = lblMessague.getText();
            lblMessague.setText(TEMP + "Espacio Renta Vacio");
            newRentStr = String.valueOf(gymControler.getArsenalGYM().getRent());

        }

        // Nombre
        if (newName.isEmpty()) {
            TEMP = lblMessague.getText();
            lblMessague.setText(TEMP + "Espacio Nombre Vacio");
            newName = gymControler.getArsenalGYM().getName();

        }

        // Horas Trabajadas
        if (newWorkedHourStr.isEmpty()) {
            TEMP = lblMessague.getText();
            lblMessague.setText(TEMP + "Espacio Horas Trabajadas Vacio");
            newWorkedHourStr = String.valueOf(gymControler.getArsenalGYM().getValueWorkedWour());
        }



        gymControler.setValueMembership(Double.parseDouble(newValueMembershipStr));
        gymControler.setRent(Integer.parseInt(newRentStr));
        gymControler.setName(newName);
        gymControler.setValueWorkedWour(Double.parseDouble(newWorkedHourStr));

        // Mostrar mensaje de éxito
        lblMessague.setText("¡Información actualizada con Éxito!");


    }





}
