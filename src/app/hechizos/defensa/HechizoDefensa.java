package app.hechizos.defensa;

import app.hechizos.Hechizo;

/**
 * HechizoDefensa
 */
public abstract class HechizoDefensa extends Hechizo {

    public HechizoDefensa(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }

    @Override
    public String getTipoHechizo() {
		return "defensa";
	}
}