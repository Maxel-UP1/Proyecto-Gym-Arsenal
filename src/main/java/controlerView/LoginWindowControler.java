package controlerView;

import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.AdminView;
import view.EmployeeView;
import view.RegisterView;

import java.io.IOException;

public class LoginWindowControler {
    public UserAcountControler userAcountControler;
    public LoginControler loginControler;
    private GymControler gymControler;
    public ComboBox voxId;
    public Label txtInfoMesague;

    public LoginWindowControler(UserAcountControler userAcountControler, LoginControler loginControler, GymControler gymControler) {
        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
        this.gymControler = gymControler;

    }

    public TextField txtUsername;
    public PasswordField txtPassword;



    public void logIn(ActionEvent actionEvent) throws IOException {
        //inicia la sesion
        txtInfoMesague.setText("Bienvenido");
        //System.out.println(userAcountControler.aaa());
        //System.out.println( "Esta vacio? " + loginControler.ddd());


        boolean loginAnswer =  loginControler.logIn(txtUsername.getText(), txtPassword.getText());

        if (loginAnswer){
            //preguna el rol para la nueva ventana
            switch (loginControler.roleUserLoged()) {
                case "EMPLOYEE":
                    EmployeeView employeeView = new EmployeeView( userAcountControler, loginControler, gymControler);
                    employeeView.start(new Stage());

                    break;
                case "ADMIN":
                    AdminView adminView = new AdminView(userAcountControler, loginControler, gymControler);
                    adminView.start(new Stage());

                    break;
                
                
            }



        }else {
            txtInfoMesague.setText("Usuario o contraseña Incorrecta");

        }


        //llamo a la otra ventana


        /*FXMLLoader fxmlLoader = new FXMLLoader(LoginView.class.getResource("hola.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 550);
        adminView.setTitle("adasd");
        adminView.setScene(scene);
        adminView.show();*/


    }


    public void SignIn(ActionEvent actionEvent) throws IOException {

        RegisterView registerView = new RegisterView( userAcountControler);
        registerView.start(new Stage());

    }


}
