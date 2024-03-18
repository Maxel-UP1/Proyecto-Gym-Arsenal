package view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Account;
import model.Role;
import model.User;
import persistence.JsonStorageUtilities;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

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

        JsonStorageUtilities js = new JsonStorageUtilities();
        /*List<User> users = new ArrayList<>();
        users.add(new User("John", "Doe", "12345", Role.ADMIN, new Account("user1")));
        users.add(new User("Jane", "Smith", "67890", Role.EMPLOYEE, new Account("user2")));

        Type userListType = new TypeToken<List<User>>(){}.getType();
        js.saveDataToFile(users, "usersBorrar" , userListType);*/
        Type userListType = new TypeToken<List<User>>(){}.getType();
        List<User>  users  =js.readContentFromFile("usersBorrar", userListType);

        for (User u: users) {
            System.out.println(u.toString());

        }
        System.out.println("donde estoy");



    }



}