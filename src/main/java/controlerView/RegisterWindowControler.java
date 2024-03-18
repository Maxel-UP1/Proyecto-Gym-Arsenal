package controlerView;

import controler.LoginControler;
import controler.UserAcountControler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.control.*;
import javax.swing.JOptionPane;
import javafx.stage.Stage;
import utilities.Utilities;

public class RegisterWindowControler {


    public Button btnGoBack;
    public PasswordField txtPassword;
    public TextField txtName;
    public TextField taxtLastName;
    public TextField txtNameUser;
    public String roleSelcted;
    public Button btrnRegister;
    public Button btnCancel;
    public Label msgError;
    public ComboBox voxId;

    Utilities utilities = new Utilities();
    ObservableList<String> rolesList = FXCollections.observableArrayList("Employee" , "Admin");
    JOptionPane jp  = new JOptionPane();



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

       boolean namesEmpity = false,  userNameBad = false, paswordBad = false, rolSec = false;

        if (name.isEmpty() || lastName.isEmpty() || nameUser.isEmpty() || password.isEmpty()) {
            setMessage("Error: ","Todos los campos son obligatorios.");
            namesEmpity = true;
        }

        // Validar nombre y apellido
        name = utilities.cleanNames(name);
        lastName = utilities.cleanNames(lastName);


        // Validar nombre de usuario
    

        if (userAcountControler.validateNameUserAcount(nameUser, "users")){
            setMessage("Error: ", "Nombre de Usuario ya esta en uso");
            userNameBad = true;
        }


        // Validar contraseña
        if (!utilities.validatePassword(password)) {
            setMessage("Error: ","La contraseña no cumple con los requisitos mínimos." + "\nmin 2 numeros una  mayusucla, una  minuscula\n  min caracteres 6 y maximo 15 caracteres");
            paswordBad = true;
        }
       if (roleSelcted == null){
           setMessage("Error: ", " Selecciona un rol");
           rolSec = true;
       }
        // todos los campos son válidos, CREA EL OBJETO Y LO ESCRIBE EN EL ARCHIVO
        if (! namesEmpity && ! userNameBad && !paswordBad  && !rolSec){
            String RegisterRensponds = userAcountControler.addAcount("users" , name, lastName, roleSelcted,nameUser, password );
            jp.showMessageDialog(null, "Cuenta Creada con exito.\nUsuario Recuerde su informacion\n" + RegisterRensponds , "CUENTA CREADA!!!", jp.INFORMATION_MESSAGE);

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


    public void viewRoles(Event event) {
        //muestra lo del combovox
        utilities.fillComboVox(voxId, rolesList);

    }

    public void selectRole(ActionEvent actionEvent) {

        roleSelcted = (String) voxId.getValue();
    }

}
