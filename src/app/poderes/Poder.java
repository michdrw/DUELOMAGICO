package app.poderes;

import java.util.ArrayList;
import java.util.List;

/**
 * Poder
 */

public abstract class Poder {
    private String nombre;
    private int nro;
    private List<Poder> poderes = new ArrayList<Poder>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    public Poder(String nombre, int nro) {
        this.nombre = nombre;
        this.nro = nro;
    }

    


}