package org.example;

public class Usuario {
    private String nombre;
    private String apellido;
    private int id;
    private String password;
    private Rol rol;

    public Usuario(String nombre, String apellido, int id, String password, Rol rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.password = password;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
