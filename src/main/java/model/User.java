package model;

public class User {
    private String name;
    private String lastName;
    private String id;
    private Role rol;
    private Account acount;
    private int horasTrabajadas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }

    public Account getAcount() {
        return acount;
    }

    public void setAcount(Account acount) {
        this.acount = acount;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public User(String name, String lastName, String id, Role rol) {

        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.rol = rol;
    }

    public User(String name, String lastName, String id, Role rol, Account account) {

        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.rol = rol;
        this.acount = account;
    }
    public User() {

    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nApellido = " + lastName + "\nID unico = " + id + "\nRol asignado= " + rol;
    }
    public  int aa(){
        return horasTrabajadas;
    }




}
