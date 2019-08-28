package app.hechizos;

/**
 * Hechizo
 */
public class Hechizo {
    public String nombre;
    public double nivelDaño;
    public double nivelCuracion;

    public Hechizo(String nombre, double nivelDaño, double nivelCuracion) {
        this.nombre = nombre;
        this.nivelDaño = nivelDaño;
        this.nivelCuracion = nivelCuracion;
    }

}