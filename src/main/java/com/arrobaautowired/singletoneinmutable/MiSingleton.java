package com.arrobaautowired.singletoneinmutable;

import lombok.Data;

/**
 * Created by jose on 6/2/18.
 * <p>
 * El patron singleton esta dentro de la GoF.  Se debe utilizar cuando únicamente cuando queramos una
 * y solo una instancia de un objeto. Ejemplos de uso de Singleton son: conexiones a base de datos, servicios.
 * Una clase singleton tiene una operacion getInstance que devolverá la instancia si no existe.
 */
@Data
public class MiSingleton {

    // Instancia estatica.
    private static MiSingleton instance = null;
    // Atributos
    private String atributo;

    // Para evitar nuevos objetos, hacemos privado el constructor.
    private MiSingleton() {

    }

    // Tenemos un metodo estatico que devolverá la instancia que necesitemos.
    public static MiSingleton getInstance() {
        if (instance == null)
            return new MiSingleton();

        return instance;
    }
}
