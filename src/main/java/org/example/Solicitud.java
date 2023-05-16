package org.example;

public class Solicitud {
    private int id;
    private String descripcion;
    private int idUsuario;
    private int ip;

    public Solicitud(int id, String descripcion, int idUsuario, int ip) {
        this.id = id;
        this.descripcion = descripcion;
        this.idUsuario = idUsuario;
        this.ip = ip;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
