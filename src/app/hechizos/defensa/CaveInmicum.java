package app.hechizos.defensa;

/**
 * CaveInmicum
 */
public class CaveInmicum extends HechizoDefensa {

    public CaveInmicum(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public CaveInmicum() {
        super("CaveInmicum", 0, 0);
    }
}