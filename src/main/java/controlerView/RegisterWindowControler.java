package controlerView;

import controler.LoginControler;
import controler.UserAcountControler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utilities.Utilities;

public class RegisterWindowControler {


    public Button btnGoBack;
    public PasswordField txtPassword;
    public TextField txtName;
    public TextField taxtLastName;
    public TextField txtNameUser;
    public Button btrnRegister;
    public Button btnCancel;
    public Label msgError;

    Utilities utilities;


    public UserAcountControler userAcountControler;
    public RegisterWindowControler(UserAcountControler userAcountControler ) {
        this.userAcountControler = userAcountControler;
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

    public void Register(ActionEvent actionEvent) {

        String name = txtName.getText();
        String lastName = taxtLastName.getText();
        String nameUser = txtNameUser.getText();
        String password = txtPassword.getText();
        Utilities utilities = new Utilities();

       boolean namesEmpity = false,  userNameBad = false, paswordBad = false;

        if (name.isEmpty() || lastName.isEmpty() || nameUser.isEmpty() || password.isEmpty()) {
            setMessage("Error: ","Todos los campos son obligatorios.");
            namesEmpity = true;
        }

        // Validar nombre y apellido
        name = utilities.cleanNames(name);
        lastName = utilities.cleanNames(lastName);

        // Validar nombre de usuario
        nameUser = utilities.cleanNames(nameUser);

        if (userAcountControler.validateNameUserAcount(nameUser, "users")){
            setMessage("Error: ", "Nombre de Usuario ya esta en uso");
            userNameBad = true;
        }


        // Validar contraseña
        if (!utilities.validatePassword(password)) {
            setMessage("Error: ","La contraseña no cumple con los requisitos mínimos." + "\nmin 2 numeros una  mayusucla, una  minuscula\n  min caracteres 6 y maximo 15 caracteres");
            paswordBad = true;
        }

        // todos los campos son válidos, CREA EL OBJETO Y LO ESCRIBE EN EL ARCHIVO
        if (! namesEmpity && ! userNameBad && !paswordBad ){
            System.out.println("SE CREO NORMAL LLAMAR PERSISTENCIA");
            setMessage("Éxito: ", "Registro exitoso.");
        }



    }

    private void setMessage(String condicion ,String message) {
        msgError.setText( condicion + message);
    }








    public void cancel(ActionEvent actionEvent) {
        setMessage("CANCELADO ", "Operación cancelada correctamente ");

        // Borrar el texto de todos los campos de texto y el campo de contraseña
        txtName.setText("");
        taxtLastName.setText("");
        txtNameUser.setText("");
        txtPassword.setText("");

    }
}
