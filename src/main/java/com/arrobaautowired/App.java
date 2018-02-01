package com.arrobaautowired;

import com.arrobaautowired.polimorfismo.Ejemplos;
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
    }
}
