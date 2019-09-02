package app.artefactos;

import java.util.ArrayList;
import java.util.List;

/**
 * Varita
 */
public class Varita extends Artefacto {
    
    public Varita(String nombre, int amplificadorDaño, int amplificadorCuracion) {
        super(nombre, amplificadorDaño, amplificadorCuracion);
    }

    public static List<Varita> varitas = new ArrayList<Varita>();

    public static void agregarVarita() {
        Varita varitaSauco = new Varita("Varita sauco", 100, 100);
        varitas.add(varitaSauco);
    }

    
}