package app.hechizos.ocio;

/**
 * Alohomora
 */
public class Alohomora extends HechizoOcio {

    public Alohomora() {
        super("Alohomora", 0, 0, 10, "ocio");
    }

    public Alohomora(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
    
    
}