package app.hechizos.curacion;

/**
 * Reparifors
 */
public class Reparifors extends HechizoCuracion {

    public Reparifors(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public Reparifors() {
        super("Reparifors", 0, 60);
    }
}