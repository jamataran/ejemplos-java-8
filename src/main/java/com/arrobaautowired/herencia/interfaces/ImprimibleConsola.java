package com.arrobaautowired.herencia.interfaces;

import lombok.extern.log4j.Log4j2;

/**
 * Created by jose on 31/1/18.
 *
 * Esta interfaz extiende a la imprimible, con ella tendremos un metodo por defecto
 * para consola, pero las clases que la implementen deberán implementar los métodos abstractos
 * de la interfaz padre.
 */
public interface ImprimibleConsola extends Imprimible {

    default void imprimibleConsola(String s) {

    }
}
