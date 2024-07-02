package org.example.fabix.FabixLibrary.service.implementation;

import org.example.fabix.FabixLibrary.Utilities.Constantes;
import org.example.fabix.FabixLibrary.entity.Vehiculo;
import org.example.fabix.FabixLibrary.service.CarsService;
import org.springframework.stereotype.Service;

@Service
public class ICarsService implements CarsService {


    /**
     * @param vehiculo
     * @return string
     */
    @Override
    public String obtenerToString(Vehiculo vehiculo) {
        return String.format(
                Constantes.CONTENIDO_TO_STRING_CARROS,
                vehiculo.getTipo(),
        vehiculo.getCapacidadPasajeros(),
        vehiculo.getMarca(),
        vehiculo.getCapacidadCarga());
    }
}
