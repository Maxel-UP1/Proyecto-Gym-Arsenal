package model;

public class Account {

    private String idPerson;
    private String nameUser;
    private String password;

    public String getNameUser() {
        return nameUser;
    }
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public String getIdPerson() {
        return idPerson;
    }
    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public Account(String idPerson, String nameUser, String password) {

        this.idPerson = idPerson;
        this.nameUser = nameUser;
        this.password = password;

    }

    public Account(String name) {
        this.idPerson = "hola";
        this.password = "vvidal";
        this.nameUser = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "idPerson='" + idPerson + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
