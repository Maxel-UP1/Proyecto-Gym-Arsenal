package controler;


import java.util.HashSet;
import model.Account;
import model.Role;
import model.User;
import utilities.Utilities;
public class LoginControler {

    private HashSet<User> users;
    private HashSet<Account> acounts;
    private Utilities accUtilities;
    private Account logedAcount;
    private User userLogged;

    public LoginControler() {
        users = new HashSet<>();
        acounts = new HashSet<>();
        accUtilities = new Utilities();
    }

    public User getUserLogged() {
        return userLogged;
    }



    public HashSet<User> getUsers() {
        return users;
    }



    public HashSet<Account> getAcounts() {
        return acounts;
    }



    public Utilities getAccUtilities() {
        return accUtilities;
    }



    public Account getLogedAcount() {
        return logedAcount;
    }



    public void loadAcounts() {
        //leer la persistencia.


    }




    public boolean logIn(String nameUser, String password) {
        for (User user : users) {

            if(user.getAcount().getNameUser().equals(nameUser) && user.getAcount().getPassword().equals(password)) {
                userLogged = user;
                logedAcount = user.getAcount();
                return true;

            }
        }

        return false;
    }

    public String informationLoggedAcount() {
        //if (logedAcount !=null) {
        return logedAcount.toString() + "\n " + userLogged.toString() ;
        //}


    }

    public void logOut() {
        if ( userLogged != null && logedAcount != null ) {
            userLogged = null ;
            logedAcount = null;
        }

    }
    //si funciona devuelve un 3 si no devuelve segun el caso un numero menor a 3
    public String addAcount(String name, String lastname, String roleType,String nameUser, String password) {
        String idNewAcount = accUtilities.generateId();
        Role rol = null;

        if(accUtilities.cleanNames(name).equals("")) {return "0";} //nombre de usuario Vacio
        if(accUtilities.cleanNames(lastname).equals("")) {return "4";} //contraseña vacia

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

        for (Account acount : acounts) {
            if (acount.getNameUser().equals(nameUser)) {return "1";} //devuelve 1 si ya esxiste el nombre de usuario
        }
        if(accUtilities.validatePassword(password)) {
            User user = new User(accUtilities.cleanNames(name), accUtilities.cleanNames(lastname), idNewAcount, rol);
            /*Acount acount = new Acount(user.getId(), accUtilities.cleanNames(nameUser), password);
            user.setAcount(acount);
            users.add(user);
            acounts.add(acount);
            return "Usuario:\n" + user.toString() + "\nCuenta:\n" + acount.toString();*/
        }
        return "2"; //devuelve 2 si la contraseña no es segura

    }





}
