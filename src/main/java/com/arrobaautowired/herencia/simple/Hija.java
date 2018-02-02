package com.arrobaautowired.herencia.simple;

import com.google.common.base.Objects;

/**
 * Created by jose on 31/1/18.
 * <p>
 * En java todos los objetos heredan de Object.
 * Una clase hija puede tener constructores del padre.
 */
public class Hija extends Padre {

    private Long edad;

    private String nombre;

    public Hija() {
        super("HIJA");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hija hija = (Hija) o;
        return Objects.equal(edad, hija.edad) &&
                Objects.equal(nombre, hija.nombre);
    }

    /**
     * Hashcode es un número (posición en memoria).
     * Por definición, dos objetos iguales tienen la misma referencia en memoria.
     * Se presenta una implementación de Java >7*/
    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), edad, nombre);
    }

}
