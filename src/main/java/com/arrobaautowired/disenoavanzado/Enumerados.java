package com.arrobaautowired.disenoavanzado;

/**
 * Created by jose on 12/2/18.
 * <p>
 * Los enumerados son un tipo especial de clases.
 * La utilidad básica de los Enumerados es la COMPARACION.
 */
public enum Enumerados {


    BWM("BMW", "Alemán"),
    RENAULT("RENAULT", "Francés");


    private final String nombre;

    private final String pais;

    Enumerados(String aleman, String pais) {
        this.nombre = aleman;
        this.pais = pais;
    }
}
