package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * Horrocrux
 */
public class Horrocrux extends Artefacto implements IReliquiaMuerte{

    public Horrocrux(String nombre, int amplificadorDaño, int amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }

    public Horrocrux() {
        super("Horrocrux", 20, 0);
    }

    
    public boolean esReliquiaMuerte() {
        return false;
    }

	
}