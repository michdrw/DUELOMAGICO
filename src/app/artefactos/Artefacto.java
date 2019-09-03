package app.artefactos;

import app.interfaces.IEsMagico;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico {
    public String nombre;
    public double amplificadorDaño;
    public double amplificadorCuracion;

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    public Artefacto(String nombre, double amplificadorDaño, double amplificadorCuracion) {
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

    public double getAmplificadorDaño() {
        return amplificadorDaño;
    }

    public void setAmplificadorDaño(int amplificadorDaño) {
        this.amplificadorDaño = amplificadorDaño;
    }

    public double getAmplificadorCuracion() {
        return amplificadorCuracion;
    }

    public void setAmplificadorCuracion(int amplificadorCuracion) {
        this.amplificadorCuracion = amplificadorCuracion;
    }


}