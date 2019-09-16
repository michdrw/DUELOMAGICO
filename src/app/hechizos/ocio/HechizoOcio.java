package app.hechizos.ocio;



import app.hechizos.Hechizo;

/**
 * HechizoOcio
 */
public abstract class HechizoOcio extends Hechizo {

    public HechizoOcio(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    
    @Override
    public String getTipoHechizo() {
		return "ocio";
	}
}