package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * VaritaSauco
 */
public class VaritaSauco extends Varita implements IReliquiaMuerte {
    
    

	public boolean esReliquiaMuerte() {
        return true;

    }

    public VaritaSauco(String nombre, double amplificadorDaño, double amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }

    public VaritaSauco() {
        super("Varita de Sauco", 2, 2);
    }


}