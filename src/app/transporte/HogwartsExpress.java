package app.transporte;

import app.interfaces.IEsMagico;

/**
 * Tren
 */
public class HogwartsExpress extends Transporte implements IEsMagico{

    public HogwartsExpress(String nombre) {
        super(nombre);
    }

    public boolean esInvisibleAMuggles() {
        return true;
    }

    public boolean esInvisible() {
        return true;
    }

}