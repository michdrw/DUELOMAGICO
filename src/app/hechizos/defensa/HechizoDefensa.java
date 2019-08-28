package app.hechizos.defensa;

import java.util.ArrayList;
import java.util.List;

import app.hechizos.Hechizo;

/**
 * HechizoDefensa
 */
public class HechizoDefensa extends Hechizo {

    public HechizoDefensa(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }

    public List<HechizoDefensa> defensores = new ArrayList<HechizoDefensa>();
}