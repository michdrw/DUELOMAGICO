package app.hechizos.ocio;

/**
 * InnerWingardiumLeviosa
 */
public class WingardiumLeviosa extends HechizoOcio {
    
    public WingardiumLeviosa() {
        super("Wingardium Leviosa", 0, 0, 10, "ocio");
    }

    public WingardiumLeviosa(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
}