package app.artefactos;

import java.util.ArrayList;
import java.util.List;

/**
 * Varita
 */
public class Varita extends Artefacto {
    
    public Varita(String nombre, double amplificadorDaño, double amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }

    public static List<Varita> varitas = new ArrayList<Varita>();

    public static void agregarVarita() {
        Varita varitaSauco = new Varita("Varita sauco", 1.1, 1.1);
        varitas.add(varitaSauco);
    }

    
}