package app.artefactos;

import app.interfaces.IEsMagico;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico {
    private String nombre;
    private int amplificadorDaño;
    private int amplificadorCuracion;

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    public Artefacto(String nombre, int amplificadorDaño, int amplificadorCuracion) {
        this.nombre = nombre;
        this.amplificadorDaño = amplificadorDaño;
        this.amplificadorCuracion = amplificadorCuracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAmplificadorDaño() {
        return amplificadorDaño;
    }

    public void setAmplificadorDaño(int amplificadorDaño) {
        this.amplificadorDaño = amplificadorDaño;
    }

    public int getAmplificadorCuracion() {
        return amplificadorCuracion;
    }

    public void setAmplificadorCuracion(int amplificadorCuracion) {
        this.amplificadorCuracion = amplificadorCuracion;
    }


}