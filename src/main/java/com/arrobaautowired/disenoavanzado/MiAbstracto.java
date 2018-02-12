package com.arrobaautowired.disenoavanzado;

/**
 * Created by jose on 7/2/18.
 * La palabra reservada abstract se puede aplicar a dos niveles. A nivel de Clase:
 * - A nivel de clase, indica que no se podrá instanciar: Servirá para aglutinar determinados elementos para una jerarquia de herencia.
 * - Un método abstracto debe estar en una clase abstracta. NO TIENEN IMPLEMENTACIÓN.
 * - La clase que extienda una clase abstracta deberá dar implementación a los métodos abstractas, si no lo hace también será abstracta.
 * - Una clase abstracta que implementa una interfaz puede no implementar algún método de ella.
 */
public abstract class MiAbstracto {

    public abstract String miMetodoAbstracto();

}
