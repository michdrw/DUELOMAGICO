package app.hechizos.ataque;

import app.hechizos.Hechizo;
import java.util.ArrayList;
import java.util.List;

/**
 * HechizoAtaque
 */
public class HechizoAtaque extends Hechizo {

    public HechizoAtaque(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }

    public List<HechizoAtaque> atacadores = new ArrayList<HechizoAtaque>();

}