package org.example;

import java.util.List;

public class Permiso {
    private int id;
    private List<Rol> roles;
    private String descripcion;

    public Permiso(int id, List<Rol> roles, String descripcion) {
        this.id = id;
        this.roles = roles;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
