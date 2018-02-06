package com.arrobaautowired;

import com.arrobaautowired.polimorfismo.Ejemplos;
import com.arrobaautowired.singletoneinmutable.MiSingleton;
import lombok.extern.log4j.Log4j2;

/**
 * Hello world!
 *
 */
@Log4j2
public class App
{
    public static void main( String[] args )
    {
        log.info("Hola Mundo!");
        Ejemplos e= new Ejemplos();
        e.getEjemplosPolimorfismo();

        // Pruebas singleton
        MiSingleton singleton = MiSingleton.getInstance();
        log.info("obtenida instancia {}", singleton);

        singleton.setAtributo("hola");
        log.info("{} => {}", singleton, singleton.getAtributo());

        singleton.setAtributo("que tal");
        log.info("{} => {}", singleton, singleton.getAtributo());
    }
}
