package controler;

import com.google.gson.reflect.TypeToken;
import model.Account;
import model.Role;
import model.User;
import persistence.JsonStorageUtilities;
import utilities.Utilities;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UserAcountControler {

    private Utilities accUtilities;
    private ArrayList<User> usersList;
    private JsonStorageUtilities jsonStorageUtilities;

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public ArrayList<Account> getAcountsList() {
        return acountsList;
    }

    public void setAcountsList(ArrayList<Account> acountsList) {
        this.acountsList = acountsList;
    }

    private ArrayList<Account> acountsList;
    private static  final Type PERSONTYPE = new TypeToken<List<User>>(){}.getType();


    public ArrayList<User> getUsers() {
        return usersList;
    }



    public ArrayList<Account> getAcounts() {
        return acountsList;
    }

      /*public String aaa(){
        String a ="";
        for (User u : usersList) {
            a = a + u.toString();
        }
        return  a;
    }*/


    public UserAcountControler() {
        this.accUtilities = new Utilities();
        this.usersList = new ArrayList<>();
        this.acountsList = new ArrayList<>();
        this.jsonStorageUtilities = new JsonStorageUtilities();
    }




    public void chargeUsersReadFile(String nameFile){

        List<User> userList = jsonStorageUtilities.readContentFromFile(nameFile , PERSONTYPE);

        //Convertir la lista de usuarios a un ArrayList<User>
        this.usersList = new ArrayList<>(userList);
        //gurada las cuentas en su lista
        for (User  user : usersList ) {
            acountsList.add(user.getAcount());
            //System.out.println(user.toString() + "\n cuenta " + user.getAcount().toString());
        }

    }
    public void writeFileReading(String nameFile, User user){
        List<User> userListTEMP = jsonStorageUtilities.readContentFromFile(nameFile , PERSONTYPE);
        userListTEMP.add(user);
        jsonStorageUtilities.saveDataToFile(userListTEMP, nameFile, PERSONTYPE);
        //se llama al metodo para recargar las cuentas en su almacenamientos.
        chargeUsersReadFile(nameFile);

    }

    public boolean validateNameUserAcount(String nameUser, String nameFile){
        chargeUsersReadFile(nameFile);
        for (User users :  usersList) {
            if (users.getAcount().getNameUser().equals(nameUser)){
                //el nombre es igual
                return true;
            }

        }

        return  false;
    }



    //si funciona devuelve la informacion completa usuario y contraseña si no devuelve segun el caso un numero menor a 3
    public String addAcount(String nameFile,String name, String lastname, String roleType,String nameUser, String password) {
        String idNewAcount = accUtilities.generateId();
        Role rol = null;

        if(accUtilities.cleanNames(name).isEmpty()) {return "0";} //nombre de usuario Vacio
        if(accUtilities.cleanNames(lastname).isEmpty()) {return "4";} //contraseña vacia

        //segun el rol asigna la variable, puede ser expandido
        switch (roleType) {
            case "Employee":
                rol = Role.EMPLOYEE;
                break;
            case "Admin":
                rol = Role.ADMIN;
                break;
        }
        //crea el usuario

        for (Account acount : acountsList) {
            if (acount.getNameUser().equals(nameUser)) {return "1";} //devuelve 1 si ya esxiste el nombre de usuario
        }
        if(accUtilities.validatePassword(password)) {
            User user = new User(accUtilities.cleanNames(name), accUtilities.cleanNames(lastname), idNewAcount, rol);
            Account acount = new Account(user.getId(), accUtilities.cleanNames(nameUser), password);
            user.setAcount(acount);

            //escribe en la persistencia, primero lee y luego escribe
            writeFileReading(nameFile, user);


            return "Usuario:\n" + user.toString() + "\nCuenta:\n" + acount.toString();
        }
        return "2"; //devuelve 2 si la contraseña no es segura

    }

    public String infoEmployes(){
        String resut = "";
        int cont = 0;
        //la persistencia ya esta leida
        for (User users : usersList) {

            if (users.getRol().equals(Role.EMPLOYEE)){
                cont++;
                resut += cont + ")ID: " + users.getId() + " " + users.getName() + "\n";
            }
        }

        return  resut;
    }
    public int cantEmployes(){
        int cont = 0;
        //la persistencia ya esta leida
        for (User users : usersList) {

            if (users.getRol().equals(Role.EMPLOYEE)){
                cont++;
            }
        }

        return  cont;
    }

    public String nameById(String id){
        for (User users: usersList) {
           if (users.getId().equals(id)){
               return  "ID: " + users.getId() + " Del Empleado: " + users.getName() + " " + users.getLastName();
           }
        }
        return  null;
    }

    //igual que el metodo anterior, solo que modifica las horas
    public void configueWorkedHoursById(String id, int workedHours){
        for (User users: usersList) {
            if (users.getId().equals(id)){
              users.setHorasTrabajadas(workedHours);
            }
        }

    }
    public int totaolWorkedHoursAllEmployes(){
        int cont = 0;
        for (User users : usersList) {

            if (users.getRol().equals(Role.EMPLOYEE)){

                cont += users.getHorasTrabajadas();
            }
        }
        return  cont;
    }





}
