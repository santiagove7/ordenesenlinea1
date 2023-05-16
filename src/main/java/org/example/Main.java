package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rol Rol1 = new Rol(1, "Administrador");
        Usuario Usuario1 = new Usuario("Mafe", "Zapata", 1 , "147", Rol1);
        Respuesta_cache Respuesta1 = new Respuesta_cache(1, 1, "este libro no esta disponible");
        //Se crean las solicitudes, dos de ellas con el mismo ip
        Solicitud_in Solicitud1 = new Solicitud_in(1, "quiero comprar este libro", 1, 123);
        Solicitud_in Solicitud2 = new Solicitud_in(2, "quiero comprar este libro", 1, 789);
        Solicitud_in Solicitud3 = new Solicitud_in(3, "quiero comprar estos audifonos", 1, 123);
        //Se crea un ArrayList y se le agregan las solicitudes creadas
        List<Solicitud_in> solicitudes = new ArrayList<>();
        solicitudes.add(Solicitud1);
        solicitudes.add(Solicitud2);
        solicitudes.add(Solicitud3);
        //Se crea el filtro
        Filtro_ip filtroIp = new Filtro_ip();
        //Se guardan las respuestas del filtro en un nuevo array que despues imprimimos (los id) para comprobar que sean los que tienen la misma ip
        List<Solicitud_in> respuestaFiltro = filtroIp.filtrarSolicitudes(solicitudes);
        for (int i = 0; i<respuestaFiltro.size(); i++){
            System.out.println(respuestaFiltro.get(i).getId());
        }
        //Se crea el cacheo
        Cacheo cacheo = new Cacheo();
        //Se guarda la respuesta del cacheo en un nuevo array que despues imprimimos (los id) para comprobar que sean los que tienen la misma solicitud
        List<Solicitud_in> respuestaCacheo = cacheo.cachearSolicitudes(solicitudes);
        for (int i = 0; i<respuestaCacheo.size(); i++){
            System.out.println(respuestaCacheo.get(i).getId());
        }


    }

}