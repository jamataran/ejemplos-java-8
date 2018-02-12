package com.arrobaautowired.disenoclases.herencia.composicion;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * Created by jose on 31/1/18.
 *
 * Una clase se puede crear con una compososición de objetos.
 * Por ejemplo una provincia puede estar compuesta por municipios.
 *
 */
@Data
@ToString
@EqualsAndHashCode
public class Provincia {

    private String nombreProvincia;
    private List<Municipio> municipiosList;

}
