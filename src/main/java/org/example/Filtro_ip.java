package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filtro_ip implements Validaciones {
    @Override
    public List<Solicitud_in> filtrarSolicitudes(List<Solicitud_in> solicitudes) {
        int ipIgual = 123; //123 para el ejemplo
        List<Solicitud_in> mismaIp = new ArrayList<>();
        for (int i=0; i< solicitudes.size(); i++){
            if (solicitudes.get(i).getIp() == ipIgual){
                mismaIp.add(solicitudes.get(i));
            }
        }
        return mismaIp;
    }
}
