package controlerView;

import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginWindowControler {
    public UserAcountControler userAcountControler;
    public LoginControler loginControler;
    public LoginWindowControler(UserAcountControler userAcountControler, LoginControler loginControler) {
        this.userAcountControler = userAcountControler;
        this.loginControler = loginControler;
    }

    public TextField txtUsername;
    public PasswordField txtPassword;

    public void logIn(ActionEvent actionEvent) {
        //inicia la sesion
        //System.out.println(userAcountControler.aaa());
        //System.out.println( "Esta vacio? " + loginControler.ddd());


        boolean loginAnswer =  loginControler.logIn(txtUsername.getText(), txtPassword.getText());

        if (loginAnswer){
            //incio sesion bien, continua la neuva ventana
            System.out.println("Inicio sesion bien");



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

    public void SignIn(ActionEvent actionEvent) {

        System.out.println("REGISTRO");

    }


}
