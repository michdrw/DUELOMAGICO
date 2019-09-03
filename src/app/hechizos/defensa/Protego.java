package app.hechizos.defensa;

/**
 * Protego
 */
public class Protego extends HechizoDefensa {

    public Protego(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
    public Protego() {
        super("Protego", 0, 0, 10, "defensa");
    }
}