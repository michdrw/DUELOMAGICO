package app.hechizos.ocio;

/**
 * Alohomora
 */
public class Alohomora extends HechizoOcio {

    public Alohomora(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    
    @Override
    public String getTipoHechizo() {
		return "ocio";
    }

    public Alohomora() {
        super("Alohomora", 0, 0, 10, false);
    }
}