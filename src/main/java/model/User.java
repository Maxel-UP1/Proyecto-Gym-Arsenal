package model;

public class User {
    private String name;
    private String lastName;
    private String id;
    private Role rol;
    private Account account;
    private int horasTrabajadas; // Nuevo atributo

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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public User(String name, String lastName, String id, Role rol, Account account, int horasTrabajadas) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.rol = rol;
        this.account = account;
        this.horasTrabajadas = horasTrabajadas;
    }

    public User(String name, String lastName, String id, Role rol, Account account) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.rol = rol;
        this.account = account;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nApellido: " + lastName + "\nID único: " + id + "\nRol asignado: " + rol +
               "\nHoras trabajadas: " + horasTrabajadas; // Incluye horasTrabajadas en el toString()
    }
}
