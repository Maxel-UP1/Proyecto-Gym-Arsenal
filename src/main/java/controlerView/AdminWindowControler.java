package controlerView;

import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AdminWindowControler {


    public Button btnModifyFinance;
    public Button btnGoBack;
    public Button btnShowFinance;
    public Button btnModifyInfoGym;
    private UserAcountControler userAcountControler;
    private LoginControler loginControler;
    public Label labelNameAdmin;




    public AdminWindowControler(UserAcountControler userAcountControler, LoginControler loginControler){
        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;

    }


    public void modifyFinance(ActionEvent actionEvent) {

    }
    public void showNameUserLoged(){
        labelNameAdmin.setText("Bienvenido Admin: " + loginControler.getUserLogged().getName());
        //labelNameAdmin.setText("holasdasd");

    }


    public void goBack(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void showFinance(ActionEvent actionEvent) {

    }

    public void modifyInfoGym(ActionEvent actionEvent) {

    }
}
