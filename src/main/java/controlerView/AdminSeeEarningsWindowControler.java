package controlerView;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Gym;
import utilities.Utilities;

import javax.swing.*;

public class AdminSeeEarningsWindowControler {

    public Button btnGoBack;
    public Label lblEarningMembers;
    public Label lblSpentSalary;
    public Label lblSpentRent;
    public Label lblTotal;
    public Label lblResult;
    public Label lblEarningProducts;
    public Button btnCalculate;
    public UserAcountControler userAcountControler;
    private LoginControler loginControler;
    private GymControler gymControler;
    private Utilities utilities = new Utilities();

    public AdminSeeEarningsWindowControler(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {

        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
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


    public void calculatedMoney(ActionEvent actionEvent) {
        userAcountControler.chargeUsersReadFile("users");
        double totalEarnings;
        double totalEarningsMember = 0;
        int totalEarningProducts = 0;
        double totalSpentSalary = 0;
        double totalSpentRent = 0;

        // Calcula las ganancias totales
        totalEarningsMember = gymControler.getArsenalGYM().getValueMembership() * gymControler.getArsenalGYM().getNumeberMembersPay();
        totalEarningProducts = utilities.generateRandomNumber(50000, 100000);
        totalEarnings = totalEarningsMember + totalEarningProducts;

        // Calcula los gastos totales en salario y renta
        totalSpentSalary = gymControler.getArsenalGYM().getValueWorkedWour() * userAcountControler.totaolWorkedHoursAllEmployes();
        totalSpentRent = gymControler.getArsenalGYM().getRent();

        // Calcula el total

        double total = totalEarnings - totalSpentSalary - totalSpentRent;

        // Muestra los resultados en los labels correspondientes
        lblEarningMembers.setText(""+ totalEarningsMember);
        lblEarningProducts.setText("" + totalEarningProducts);
        lblSpentSalary.setText("" + totalSpentSalary);
        lblSpentRent.setText("" + totalSpentRent);
        lblTotal.setText("" + total);

        // Determina si hay ganancias o pérdidas y muestra el resultado en lblResult
        if (total >= 0) {
            lblResult.setText("Ganancias: $+" + total);
            lblResult.setTextFill(Color.GREEN); // Cambia el color del texto a verde
        } else {
            lblResult.setText("Pérdidas: $" + total);
        }
    }


}
