package app.hechizos.defensa;

/**
 * Protego
 */
public class Protego extends HechizoDefensa {

    public Protego(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public Protego() {
        super("Protego", 0, 0);
    }

}