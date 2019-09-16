package app.transporte;

import app.interfaces.IEsMagico;

/**
 * Escoba
 */
public class Escoba extends Transporte implements IEsMagico{

    public Escoba(String nombre) {
        super(nombre);
    }

    public boolean esInvisibleAMuggles() {
        return false;
    }

    public boolean esInvisible() {
        return false;
    }

}