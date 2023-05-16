package org.example;

import java.util.List;

public interface Validaciones {

    default String sanearDatos(String datos){
        return null;
    }

    default List<Solicitud_in> filtrarSolicitudes(List<Solicitud_in> solicitudes){
        return null;
    }

    default List<Solicitud_in> cachearSolicitudes(List<Solicitud_in> solicitudes){
        return null;
    }

}
