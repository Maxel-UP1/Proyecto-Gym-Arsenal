package controler;


import java.util.HashSet;
import model.Account;
import model.Role;
import model.User;
import utilities.Utilities;
public class LoginControler {
    //Cuentas e usuarios viene de la persistencia
    private HashSet<User> users;
    private HashSet<Account> acounts;

    private User userLogged;
    private Account logedAcount;


    public LoginControler() {
        users = new HashSet<>();
        acounts = new HashSet<>();
    }

    public User getUserLogged() {
        return userLogged;
    }


    public Account getLogedAcount() {
        return logedAcount;
    }



    public void loadAcounts() {
        //leer la persistencia llamadno al controaldor


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




}
