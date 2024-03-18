package controler;


import java.util.ArrayList;

import model.Account;
import model.User;

public class LoginControler {
    //Cuentas e usuarios viene de la persistencia
    UserAcountControler userAcountControler;

    private ArrayList<User> usersList;
    private ArrayList<Account> acountsList ;
    private Account logedAcount;
    private User userLogged;

    public LoginControler(UserAcountControler userAcountControler) {
        this.usersList = userAcountControler.getUsersList();
        this.acountsList = userAcountControler.getAcountsList();
        this.userAcountControler = userAcountControler;

    }


    public String ddd(){
    String a ="";
        for (User u : usersList) {
            a = a + u.toString();
        }
        return  a;
    }



    public User getUserLogged() {
        return userLogged;
    }


    public Account getLogedAcount() {
        return logedAcount;
    }

    public boolean logIn(String nameUser, String password) {
        for (User user : usersList) {

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
