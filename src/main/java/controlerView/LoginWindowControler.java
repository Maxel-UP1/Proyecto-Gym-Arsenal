package controlerView;

import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
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
    public ComboBox voxId;

    public LoginWindowControler(UserAcountControler userAcountControler, LoginControler loginControler) {
        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
    }

    public TextField txtUsername;
    public PasswordField txtPassword;

    public void logIn(ActionEvent actionEvent) throws IOException {
        //inicia la sesion
        //System.out.println(userAcountControler.aaa());
        //System.out.println( "Esta vacio? " + loginControler.ddd());


        boolean loginAnswer =  loginControler.logIn(txtUsername.getText(), txtPassword.getText());

        if (loginAnswer){
            //preguna el rol para la nueva ventana
            switch (loginControler.roleUserLoged()) {
                case "EMPLOYEE":
                    EmployeeView employeeView = new EmployeeView( userAcountControler);
                    employeeView.start(new Stage());

                    break;
                case "ADMIN":
                    AdminView adminView = new AdminView(userAcountControler);
                    adminView.start(new Stage());

                    break;
                
                
            }



        }else {
            System.out.println("Nombre usu o contraseña incorrecta ");
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
