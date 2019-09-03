package app.hechizos.defensa;

/**
 * Protego
 */
public class Protego extends HechizoDefensa {

    public Protego(String nombre, double nivelDaño, double nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public Protego() {
        super("Protego", 0, 0, 10);
    }
}