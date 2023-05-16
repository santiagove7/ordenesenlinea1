package org.example;

import java.util.List;

public class Rol {
    private int id;
    private String nombreRol;

    public Rol(int id, String nombreRol) {
        this.id = id;
        this.nombreRol = nombreRol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRolL() {
        return nombreRol;
    }

    public void setNombreRolL(String nombreRolL) {
        this.nombreRol = nombreRolL;
    }
}
