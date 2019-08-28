package app.hechizos.ocio;

import java.util.ArrayList;
import java.util.List;

import app.hechizos.Hechizo;

/**
 * HechizoOcio
 */
public class HechizoOcio extends Hechizo {

    public HechizoOcio(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);}

    public List<HechizoOcio> ociadores = new ArrayList<HechizoOcio>();
}