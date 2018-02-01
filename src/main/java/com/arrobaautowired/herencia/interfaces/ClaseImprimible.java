package com.arrobaautowired.herencia.interfaces;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jose on 31/1/18.
 *
 * Debe implementar los métodos abstractos de la Interfaz padre de
 * Imprimible, Imprimible por consola.
 */
@Log4j2
public class ClaseImprimible implements ImprimibleConsola {
    @Override
    public void print(String s) {
        log.info("{}", s);
    }
}
