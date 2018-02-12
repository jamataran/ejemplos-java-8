package com.arrobaautowired.disenoavanzado;

import com.google.common.base.Objects;

/**
 * Created by jose on 9/2/18.
 */
public class ExternasYAnidadas {

    private int atributoClaseExterna;

    public ExternasYAnidadas(int atributoClaseExterna) {

        this.atributoClaseExterna = atributoClaseExterna;
    }

    public int getAtributoClaseExterna() {

        return atributoClaseExterna;
    }

    public void setAtributoClaseExterna(int atributoClaseExterna) {
        this.atributoClaseExterna = atributoClaseExterna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExternasYAnidadas that = (ExternasYAnidadas) o;
        return atributoClaseExterna == that.atributoClaseExterna;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(atributoClaseExterna);
    }

    public class Anidadada {

        String atributoAnidado;
        public Anidadada(String atributoAnidado) {
            this.atributoAnidado = atributoAnidado;
        }

        public String getAtributoAnidado() {
            return atributoAnidado;
        }

        public void setAtributoAnidado(String atributoAnidado) {
            this.atributoAnidado = atributoAnidado;
        }

        public int getAtributoExterno() {
            return atributoClaseExterna;
        }

    }


    public static class AnidadaEstatica {
        public int n;

    }
}
