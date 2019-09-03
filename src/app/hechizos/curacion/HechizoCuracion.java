package app.hechizos.curacion;

import app.hechizos.Hechizo;

/**
 * HechizoCuracion
 */
public abstract class HechizoCuracion extends Hechizo {

    public HechizoCuracion(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }

    
}