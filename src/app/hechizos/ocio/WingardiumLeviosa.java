package app.hechizos.ocio;

/**
 * InnerWingardiumLeviosa
 */
public class WingardiumLeviosa extends HechizoOcio {
    
    public WingardiumLeviosa() {
        super("Wingardium Leviosa", 0, 0, 10);
    }

    public WingardiumLeviosa(String nombre, double nivelDaño, double nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
}