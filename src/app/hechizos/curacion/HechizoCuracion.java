package app.hechizos.curacion;

import app.hechizos.Hechizo;

/**
 * HechizoCuracion
 */
public abstract class HechizoCuracion extends Hechizo {

    public HechizoCuracion(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }

    @Override
    public String getTipoHechizo() {
		return "curacion";
	}
    
}