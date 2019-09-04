package app.hechizos.curacion;

/**
 * Reparifors
 */
public class Reparifors extends HechizoCuracion {

    public Reparifors(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public Reparifors() {
        super("Reparifors", 0, 20, 10);
    }

    @Override
    public String getTipoHechizo() {
		return "curacion";
	}
}