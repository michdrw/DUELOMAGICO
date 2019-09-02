package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * VaritaSauco
 */
public class VaritaSauco extends Varita implements IReliquiaMuerte {
    
    

	public boolean esReliquiaMuerte() {
        return true;

    }

    public VaritaSauco(String nombre, int amplificadorDaño, int amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }

    

}