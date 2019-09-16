package app.hechizos.ocio;

/**
 * InnerWingardiumLeviosa
 */
public class WingardiumLeviosa extends HechizoOcio {
    
    

    public WingardiumLeviosa(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    
    @Override
    public String getTipoHechizo() {
		return "ocio";
    }
    
    public WingardiumLeviosa() {
        super("Wingardium Leviosa", 0, 0, 10, false);
    }
}