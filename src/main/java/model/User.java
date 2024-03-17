package model;

public class User {
    private String name;
    private String lastName;
    private String id;
    private Role rol;
    private Acount acount;

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

    public Acount getAcount() {
        return acount;
    }

    public void setAcount(Acount acount) {
        this.acount = acount;
    }

    public User(String name, String lastName, String id, Role rol) {

        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.rol = rol;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nApellido = " + lastName + "\nID unico = " + id + "\nRol asignado= " + rol;
    }




}
