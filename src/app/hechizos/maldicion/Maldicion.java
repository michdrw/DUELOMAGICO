package app.hechizos.maldicion;

/**
 * Maldicion
 */
public class Maldicion {
    public String nombre;
    public double nivelDaño;
    public double nivelCuracion;

    public Maldicion(String nombre, double nivelDaño, double nivelCuracion) {
        this.nombre = nombre;
        this.nivelDaño = nivelDaño;
        this.nivelCuracion = nivelCuracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNivelDaño() {
        return nivelDaño;
    }

    public void setNivelDaño(double nivelDaño) {
        this.nivelDaño = nivelDaño;
    }

    public double getNivelCuracion() {
        return nivelCuracion;
    }

    public void setNivelCuracion(double nivelCuracion) {
        this.nivelCuracion = nivelCuracion;
    }
}