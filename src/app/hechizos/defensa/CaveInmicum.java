package app.hechizos.defensa;

/**
 * CaveInmicum
 */
public class CaveInmicum extends HechizoDefensa {

    public CaveInmicum (String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
    public CaveInmicum() {
        super("CaveInmicum", 0, 0, 10, "defensa");
    }
}