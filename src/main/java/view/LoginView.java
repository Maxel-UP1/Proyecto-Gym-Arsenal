package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginView extends Application {

    public static Stage currentStage;


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginView.class.getResource("loginViewWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
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