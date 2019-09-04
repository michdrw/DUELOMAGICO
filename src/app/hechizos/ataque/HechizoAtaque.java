package app.hechizos.ataque;

import app.hechizos.Hechizo;

/**
 * HechizoAtaque
 */
public class HechizoAtaque extends Hechizo {

    public HechizoAtaque(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    
    @Override
    public String getTipoHechizo() {
		return "ataque";
	}
}