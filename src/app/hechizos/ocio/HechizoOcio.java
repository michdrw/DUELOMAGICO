package app.hechizos.ocio;



import app.hechizos.Hechizo;

/**
 * HechizoOcio
 */
public class HechizoOcio extends Hechizo {

    public HechizoOcio(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    
    @Override
    public String getTipoHechizo() {
		return "ocio";
	}
}