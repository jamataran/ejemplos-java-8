package com.arrobaautowired.polimorfismo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jose on 1/2/18.
 */
@AllArgsConstructor
@EqualsAndHashCode
@Data
@Log4j2
public class Rectangulo {

    private Long base;

    private Long altura;

    public Long getArea() {
        log.info("Area de un RECTÁNGULO");
        return getBase() * getAltura();
    }

}
