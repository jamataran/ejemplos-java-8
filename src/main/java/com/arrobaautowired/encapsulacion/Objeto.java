package com.arrobaautowired.encapsulacion;

/**
 * Created by jose on 30/1/18.
 *
 * Un objeto es el unico que conoce su estructura, únicamente expone cierta parte de un contenido.
 * Cada clase debe tener un único fichero .java asociado.
 */
public class Objeto {

    // private: Solo se puede acceder a él desde dentro de la clase.
    private String atributoPrivado;

    // public: Cualquiera puede acceder.
    public String atributoPublico;

    // protected: Su clase y sus derivados.
    protected  String atributoProtected;

    // Default: Solo su clase y los paquetes.
    String atributoDefault;

}
