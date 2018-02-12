package com.arrobaautowired.disenoavanzado;

/**
 * Created by jose on 8/2/18.
 * Desde el punto de vista de la clase, anotamos con final aquellas que no pueden ser
 * usadas como padre en herencias.
 *
 * Desde el punto de vista de métodos, definen aquellos que no pueden ser sobrescritos.
 *
 * Desde el punto de vista de objetos, no permiten asignar otros objetos (referencias a otros objetos.
 */
public final class MiClaseFinal {

    String atributo;

    final String [] array;

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public MiClaseFinal(String atributo) {

        this.atributo = atributo;
        array = new String[0];
    }

    public void hacerAlgo(final String objeto){

    }
}
