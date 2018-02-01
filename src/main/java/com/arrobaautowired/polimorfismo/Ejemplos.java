package com.arrobaautowired.polimorfismo;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jose on 1/2/18.
 *
 * El polimorfismo de uno de los cuatro pilares de la POO.
 * Mediante polimorfismo podemos guardar objetos de una superclase en objetos heredados.
 * Java elige en tiempo de ejecucion el método que tiene que usar: clase hija o clase padre
 * si las hijas no tienen implementación de estos métodos. Si la hija oculta la implementación de un método de padre se elegirá ese.
 *
 */
@Log4j2
public class Ejemplos {


    Rectangulo r1= new Rectangulo(1L,2L);
    Rectangulo c1= new  Cuadrado(1L);

    public void getEjemplosPolimorfismo(){
        List<Rectangulo> listaRectangulos = new ArrayList<>();
        for(int i=0; i<10; i++){
            listaRectangulos.add(new Random().nextBoolean()? new Cuadrado(new Random().nextLong()):new Rectangulo(new Random().nextLong(),new Random().nextLong()));
        }

        listaRectangulos.forEach(rectangulo -> {
            log.info("Area: {}", rectangulo.getArea());
        });
    }

}
