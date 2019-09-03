package app.hechizos.defensa;

/**
 * CaveInmicum
 */
public class CaveInmicum extends HechizoDefensa {

    public CaveInmicum(String nombre, double nivelDaño, double nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public CaveInmicum() {
        super("CaveInmicum", 0, 0, 10);
    }
}