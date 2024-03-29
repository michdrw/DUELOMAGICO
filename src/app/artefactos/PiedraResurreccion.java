package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * PiedraResurreccion
 */
public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {

    public boolean esReliquiaMuerte() {
        return true;

    }

    public PiedraResurreccion(String nombre, int amplificadorDaño, int amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }

    public PiedraResurreccion() {
        super("Piedra de la Resurreción", 0, 20);
    }

    
}