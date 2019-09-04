package app.hechizos.imperdonable;

import app.hechizos.Hechizo;

/**
 * Maldicion
 */
public class HechizoImperdonable extends Hechizo{

    public HechizoImperdonable(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    
    @Override
    public String getTipoHechizo() {
		return "imperdonable";
	}
}