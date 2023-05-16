package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cacheo implements Validaciones{

    @Override
    public List<Solicitud_in> cachearSolicitudes(List<Solicitud_in> solicitudes) {
        String solicitud = "quiero comprar este libro";
        List<Solicitud_in> mismaSolicitud = new ArrayList<>();
        for (int i=0; i< solicitudes.size(); i++){
            if (solicitudes.get(i).getDescripcion() == solicitud){
                mismaSolicitud.add(solicitudes.get(i));
            }
        }
        return mismaSolicitud;
    }

}
