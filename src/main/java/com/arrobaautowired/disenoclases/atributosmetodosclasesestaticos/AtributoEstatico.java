package com.arrobaautowired.disenoclases.atributosmetodosclasesestaticos;

import lombok.extern.log4j.Log4j2;

/**
 * Created by jose on 5/2/18.
 * <p>
 * En java, tenemos atribuitos y metodos estaticos.
 * Un atributo estatico, va asociado a una clase y no a una instancia como el resto del los atributos.
 * Un metodo estatico, sigue el mismo modelo.
 * Tambien tenemos clases estaticas. No puede ser una clase TOPLEVEL estatica, pero si una dentro de otra.
 */
@Log4j2
public class AtributoEstatico {

    // Un atributo estatico.
    public final static String constante = "HOLA";

    public static String metodoEstadico() {
        return constante;
    }

    public static void main(String[] args) {
        //ClaseInterna claseInterna= new ClaseInterna("hola"); --> NO PERMITIDO
        ClaseInterna claseInterna = new AtributoEstatico().new ClaseInterna("HOla"); // Debemos crear una isntancia de la clase para llamar.
        log.info("{}", claseInterna);

        // ESTATICA
        ClaseNueva claseNueva= new ClaseNueva("hola");

    }

    /**
     * Clase interna, para acceder a ella debemos crear una instancia de la clase padre.
     * */
    public class ClaseInterna{
        private String atributoInterno;

        public ClaseInterna(String atributoInterno) {
            this.atributoInterno = atributoInterno;
        }
    }


    /**
     * Esta clase si puede ser referenciada sin crear una instancia de la padre.*/
    public static class ClaseNueva{
        private String atributo;

        public ClaseNueva(String atributo) {
            this.atributo = atributo;
        }
    }
}
