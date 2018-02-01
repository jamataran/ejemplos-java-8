package com.arrobaautowired.herencia.simple;

import lombok.Data;

/**
 * Created by jose on 31/1/18.
 * <p>
 * Herencia es el concepto por el cual se crean relaciones de asociación entre clases en Java.
 * El tipo de relación que se establece es: ES-UN
 * Los atributos de la clase padre marcados como protected pueden ser accedidos desde las hijas, pero
 * Oracle recomienda que sean privados.
 */
@Data
public class Padre {

    private String atributoPadre;

    private Long atributoPadreLong;

    public Padre(String atributo) {
        this.atributoPadre = atributo;
    }

}
