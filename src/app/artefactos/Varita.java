package app.artefactos;

import java.util.ArrayList;
import java.util.List;

/**
 * Varita
 */
public class Varita extends Artefacto {
    public String nombre;

    public static List<Varita> varitas = new ArrayList<Varita>();

    public static void agregarVarita() {
        Varita varitaSauco = new Varita();
        varitaSauco.nombre = "Varita sauco";
        
        varitas.add(varitaSauco);
    }
}