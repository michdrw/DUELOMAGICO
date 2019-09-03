package app.hechizos.curacion;

/**
 * Reparifors
 */
public class Reparifors extends HechizoCuracion {

    public Reparifors(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
    public Reparifors() {
        super("Reparifors", 0, 20, 10, "curacion");
    }
}