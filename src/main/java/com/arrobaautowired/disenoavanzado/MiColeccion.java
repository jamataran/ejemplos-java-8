package com.arrobaautowired.disenoavanzado;

import lombok.extern.log4j.Log4j2;

/**
 * Created by jose on 9/2/18.
 * <p>
 * Un ejemplo claro de necesidad de clases internas son los iteradores.
 * Vamos a crear una coleccion nueva, que almacenara valores de enteros.
 */
@Log4j2
public class MiColeccion {

    private int[] array;

    // El constructor definirá el tamaño de la coleccion.
    public MiColeccion(int n) {
        // Creo el array
        array = new int[n];

        // Relleno
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

    }

    public void imprimePares() {
        IteradorColeccionPares iteradorColeccionPares = new IteradorColeccionPares();
        while (iteradorColeccionPares.hasNext()) {
            log.debug("{}", iteradorColeccionPares.getNext());
        }
    }

    // Creamos un iterador para recorrer la coleccion. Itera posiciones pares.
    public class IteradorColeccionPares {

        private int puntero = 0;

        public boolean hasNext() {
            return puntero <= array.length;
        }

        public int getNext() {
            int valor = array[puntero];
            puntero += 2;
            return puntero;
        }

    }

}
