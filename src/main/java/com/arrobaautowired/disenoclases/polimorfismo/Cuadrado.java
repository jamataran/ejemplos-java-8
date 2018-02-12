package com.arrobaautowired.disenoclases.polimorfismo;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * Created by jose on 1/2/18.
 */
@Data
@Log4j2
public class Cuadrado extends  Rectangulo{


    public Cuadrado(Long lado){
        super(lado,lado);
    }

    public Long getArea(){
        log.info("Area de un cuadrado");
        return getBase()*getBase();
    }
}
