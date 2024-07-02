package org.example.fabix.FabixLibrary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {

    private String tipo;

    private int capacidadPasajeros;

    private String marca;

    private int capacidadCarga;

}
