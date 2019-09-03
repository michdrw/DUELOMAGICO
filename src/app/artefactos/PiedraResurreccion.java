package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * PiedraResurreccion
 */
public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {

    public boolean esReliquiaMuerte() {
        return true;

    }

    public PiedraResurreccion(String nombre, double amplificadorDaño, double amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }

    
}