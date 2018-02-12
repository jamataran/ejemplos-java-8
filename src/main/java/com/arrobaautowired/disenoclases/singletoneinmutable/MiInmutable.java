package com.arrobaautowired.disenoclases.singletoneinmutable;

/**
 * Created by jose on 6/2/18.
 * Un objeto inmutable es aquel que no se puede modificar una vez instanciado.
 * Por ejemplo, un objeto inmutable es un objeto String.
 * No tiene setter. Las propiedades y la misma clase son final (no puede tener hijos)
 */
public final class MiInmutable {

    private final String variable;

    public MiInmutable(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }
}
