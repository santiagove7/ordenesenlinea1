package org.example;

public class Respuesta_cache {
    private int id;
    private int idSolicitud;
    private String respuesta;

    public Respuesta_cache(int id, int idSolicitud, String respuesta) {
        this.id = id;
        this.idSolicitud = idSolicitud;
        this.respuesta = respuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
