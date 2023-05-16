package org.example;

public class Sanear_datos implements Validaciones{
    private String datos;

    public Sanear_datos(String datos) {
        this.datos = datos;
    }

    @Override
    public String sanearDatos(String datos) {
        return "datos saneados";
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
}
