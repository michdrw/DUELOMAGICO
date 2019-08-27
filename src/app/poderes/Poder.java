package app.poderes;

import java.util.ArrayList;
import java.util.List;

/**
 * Poder
 */

public class Poder {
    public String nombre;
    public int nro;
    public List<Poder> poderes = new ArrayList<Poder>();

    public void agregarPoderes() {
        Poder p1 = new Poder();
        p1.nombre = "Invisibilidad";
        p1.nro = 1;
        poderes.add(p1);

        Poder p2 = new Poder();
        p2.nombre = "Metamorfosis";
        p2.nro = 2;
        poderes.add(p2);

        Poder p3 = new Poder();
        p3.nombre = "Parseltongue";
        p3.nro = 3;
        poderes.add(p3);
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }



}