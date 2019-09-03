package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * CapaInvisible
 */
public class CapaInvisible extends Artefacto implements IReliquiaMuerte {

    

	public boolean esReliquiaMuerte() {
        return true;

    }

    public CapaInvisible(String nombre, double amplificadorDaño, double amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }

    public CapaInvisible() {
        super("Capa de la Invisibilidad", 0, 2);
    }

}