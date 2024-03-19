package view;


import controler.GymControler;
import controler.LoginControler;
import controler.UserAcountControler;
import controlerView.LoginWindowControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class LoginView extends Application {
    private  UserAcountControler userAcountControler;
    private GymControler gymControler;
    private LoginControler loginControler;

    public static Stage currentStage;

    public LoginView(){
        userAcountControler = new UserAcountControler();
        gymControler = new GymControler();

    }


    @Override
    public void start(Stage stage) throws IOException {
        //lee la persistencia para cargar en memoria
        userAcountControler.chargeUsersReadFile("users");
        gymControler.setNumbersEmployes(userAcountControler.cantEmployes());

        loginControler = new LoginControler(userAcountControler);


        //muestra la ventana principal
        FXMLLoader fxmlLoader = new FXMLLoader(LoginView.class.getResource("loginViewWindow.fxml"));
        LoginWindowControler loginController = new LoginWindowControler(userAcountControler, loginControler, gymControler);
        fxmlLoader.setControllerFactory(controllerClass -> {
            // Devolver la instancia del controlador
            return loginController;
        });
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Finazas GYM Arsenal");
        stage.setScene(scene);
        stage.show();


    }


    //Metodo para cerrar las ventanas
    public void closeWindows(Stage stage){
        stage.close();
    }


    public static void main(String[] args) {
        launch();


    }



}