package app.artefactos;

import java.util.ArrayList;
import java.util.List;

/**
 * Artefacto
 */
public class Artefacto {
    public String nombre;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public void agregarArtefactos() {
        Artefacto a1 = new Artefacto();
        a1.nombre = "Horrocrux";
        artefactos.add(a1);

        Artefacto a2 = new Artefacto();
        a2.nombre = "Capa Invisible";
        artefactos.add(a2);

        Artefacto a3 = new Artefacto();
        a3.nombre = "Varita";
        artefactos.add(a3);
    }

    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }

    public static void add(List<Artefacto> artefacto) {
    }

    public static void add(Artefacto artefacto) {
    }
  
}