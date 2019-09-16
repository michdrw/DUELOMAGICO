package app.hechizos.ataque;

import app.hechizos.Hechizo;

/**
 * HechizoAtaque
 */
public abstract class HechizoAtaque extends Hechizo {

    public HechizoAtaque(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    
    @Override
    public String getTipoHechizo() {
		return "ataque";
	}
}