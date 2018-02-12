package com.arrobaautowired.disenoavanzado;

import lombok.extern.log4j.Log4j2;

/**
 * Created by jose on 9/2/18.
 */
@Log4j2
public class TrabajoClasesAnidadas {

    ExternasYAnidadas externasYAnidadas = new ExternasYAnidadas(1);
    //ExternasYAnidadas.Anidadada anidada = new ExternasYAnidadas(1).Anidadada();

    public TrabajoClasesAnidadas() {
    }

    public static void main(String[] args) {
        MiColeccion coleccion = new MiColeccion(100);
        coleccion.imprimePares();

    }


}
