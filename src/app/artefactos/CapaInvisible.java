package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * CapaInvisible
 */
public class CapaInvisible extends Artefacto implements IReliquiaMuerte {

    

	public boolean esReliquiaMuerte() {
        return true;

    }

    public CapaInvisible(String nombre, int amplificadorDaño, int amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }
}